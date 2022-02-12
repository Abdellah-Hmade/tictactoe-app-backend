package org.hmd377.tictactoeapp.vo;

public class UserTokenVo {

    private String accessToken;
    private String refreshToken;
    private UserVo user;
  
    public UserTokenVo(UserVo user, String accessToken, String refreshToken) {
      this.user = user;
      this.user.setPassword(null);
      this.accessToken = accessToken;
      this.refreshToken = refreshToken;
    }
  
    public UserTokenVo() {}
  
    public UserVo getUser() {
      return user;
    }
  
    public void setUser(UserVo user) {
      this.user = user;
    }
  
    public String getAccessToken() {
      return this.accessToken;
    }
  
    public void setAccessToken(String accessToken) {
      this.accessToken = accessToken;
    }
  
    public String getRefreshToken() {
      return this.refreshToken;
    }
  
    public void setRefreshToken(String refreshToken) {
      this.refreshToken = refreshToken;
    }
  }
  
