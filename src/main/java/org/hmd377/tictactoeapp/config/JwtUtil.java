package org.hmd377.tictactoeapp.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.hmd377.tictactoeapp.services.UserService;
import org.hmd377.tictactoeapp.vo.UserVo;
import java.util.Base64;
import java.util.List;
import java.util.regex.Pattern;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;

@Component
public class JwtUtil {

  @Autowired
  UserService usersService;

  Logger logger = LoggerFactory.getLogger(JwtUtil.class);
/*
  public String getRole(HttpHeaders headers) {
    return this.getAllClaimsFromToken(headers, "role");
  }
*/
  public Integer getId(HttpHeaders headers) {
    Integer id = Integer.parseInt(this.getAllClaimsFromToken(headers, "id"));
    logger.warn("id: " + id);
    return id;
  }

  public UserVo getUser(HttpHeaders headers) {
    Integer id = this.getId(headers);
    return usersService.get(id);
  }

  private String getAllClaimsFromToken(HttpHeaders headers, String claim) {
    List<String> authHeaders = headers.get("Authorization");

    if (authHeaders != null && authHeaders.size() > 0) {
      String authHeader = authHeaders.get(0);

      if (authHeader.startsWith("Bearer ")) {
        String token = authHeader.substring(7, authHeader.length());
        String claimsB64 = token.split(Pattern.quote("."))[1];
        String claimsJson = new String(Base64.getDecoder().decode(claimsB64));

        logger.info("claimsJson: " + claimsJson);

        ObjectMapper mapper = new ObjectMapper();
        try {
          return mapper.readTree(claimsJson).get(claim).asText();
        } catch (Exception e) {}
      }
    }
    throw new RuntimeException("token.missing");
  }
}
