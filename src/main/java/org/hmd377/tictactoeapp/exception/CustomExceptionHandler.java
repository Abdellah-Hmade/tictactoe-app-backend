package org.hmd377.tictactoeapp.exception;

import org.hmd377.tictactoeapp.vo.GlobalResponseVo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {

  @ExceptionHandler(CustomException.class)
  public final ResponseEntity<GlobalResponseVo<Object>> handleAllExceptions(
    CustomException ex
  ) {
    return ResponseEntity
      .status(ex.getStatus())
      .body(
        new GlobalResponseVo<Object>(
          ex.getStatus().toString(),
          ex.getCode(),
          ex.getMessage(),
          null
        )
      );
  }
}
