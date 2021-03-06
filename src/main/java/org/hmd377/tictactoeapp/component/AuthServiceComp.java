package org.hmd377.tictactoeapp.component;

import org.hmd377.tictactoeapp.vo.UserVo;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AuthServiceComp {

  @Value("${jwt.secret}")
  private String secret;

  @Value("${jwt.expiration}")
  private String expirationTime;

  private Key key;

  @PostConstruct
  public void init() {
    this.key = Keys.hmacShaKeyFor(secret.getBytes());
  }

  public Claims getAllClaimsFromToken(String token) {
    return Jwts
      .parserBuilder()
      .setSigningKey(key)
      .build()
      .parseClaimsJws(token)
      .getBody();
  }

  public Date getExpirationDateFromToken(String token) {
    return getAllClaimsFromToken(token).getExpiration();
  }

  private Boolean isTokenExpired(String token) {
    final Date expiration = getExpirationDateFromToken(token);
    return expiration.before(new Date());
  }

  public String generate(UserVo userVo, String type) {
    Map<String, Object> claims = new HashMap<>();
    claims.put("id", userVo.getId());
    return this.doGenerateToken(claims, userVo.getUserName(), type);
  }

  private String doGenerateToken(
    Map<String, Object> claims,
    String username,
    String type
  ) {
    long expirationTimeLong;
    if ("ACCESS".equals(type)) {
      expirationTimeLong = Long.parseLong(expirationTime) * 1000;
    } else {
      expirationTimeLong = Long.parseLong(expirationTime) * 1000 * 5;
    }
    final Date createdDate = new Date();
    final Date expirationDate = new Date(
      createdDate.getTime() + expirationTimeLong
    );

    return Jwts
      .builder()
      .setClaims(claims)
      .setSubject(username)
      .setIssuedAt(createdDate)
      .setExpiration(expirationDate)
      .signWith(key)
      .compact();
  }

  public Boolean validateToken(String token) {
    return !isTokenExpired(token);
  }
}
