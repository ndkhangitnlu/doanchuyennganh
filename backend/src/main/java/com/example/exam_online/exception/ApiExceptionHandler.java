package com.example.exam_online.exception;

import com.example.exam_online.response.ResponseHandler;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApiExceptionHandler {
    @ExceptionHandler({CustomException.class})
    public ResponseEntity<ResponseHandler> customException(CustomException e) {
        ResponseHandler responseHandler = new ResponseHandler(e.getMessage(), e.getStatus().value(), null);
        return ResponseEntity.status(e.getStatus()).body(responseHandler);
    }
}
