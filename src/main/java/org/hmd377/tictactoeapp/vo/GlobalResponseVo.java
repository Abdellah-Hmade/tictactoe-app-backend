package org.hmd377.tictactoeapp.vo;

public class GlobalResponseVo<Obj> {

  private String status;
  private int code;
  private String message;
  private Obj result;

  public GlobalResponseVo(String status, int code, String message, Obj result) {
    this.status = status;
    this.code = code;
    this.message = message;
    this.result = result;
  }

  public GlobalResponseVo(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public Obj getResult() {
    return result;
  }

  public void setResult(Obj result) {
    this.result = result;
  }
}
