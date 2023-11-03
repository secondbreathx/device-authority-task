package com.authority.device.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.core.codec.ByteArrayDecoder;
import org.springframework.http.HttpStatus;

import static org.springframework.http.HttpStatus.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum ErrorType {
  INTERNAL_SERVER(3000, "An internal server error occurred.", INTERNAL_SERVER_ERROR),
  INVALID_PARAMETER_ERROR(3001, "Invalid field(s).", BAD_REQUEST),
  DEVICE_NOT_FOUND(3002, "Device not found", NOT_FOUND),
  EXIST_DEVICE(3003, "Device is exist",BAD_REQUEST);

  private int code;
  private String message;
  private HttpStatus httpStatus;
}
