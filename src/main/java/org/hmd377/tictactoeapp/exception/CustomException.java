package org.hmd377.tictactoeapp.exception;

import org.springframework.http.HttpStatus;

public class CustomException extends RuntimeException {

  private int code;
  private String message;
  private HttpStatus status;

  protected CustomException() {}

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public HttpStatus getStatus() {
    return status;
  }

  public void setStatus(HttpStatus status) {
    this.status = status;
  }

  public CustomException(HttpStatus status, int code, String message) {
    this.setStatus(status);
    this.setCode(code);
    this.setMessage(message);
  }
}
