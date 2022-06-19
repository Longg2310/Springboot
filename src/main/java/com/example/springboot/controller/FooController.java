package com.example.springboot.controller;

import com.example.springboot.entity.ErrorResponse;
import com.example.springboot.exception.DemoException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class FooController {
    @ExceptionHandler({ DemoException.class })
    public ResponseEntity<ErrorResponse> handleException() {

        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setCode("400");
        errorResponse.setMessage("Không tìm thấy user trong database");
        return new ResponseEntity<ErrorResponse>(errorResponse, HttpStatus.BAD_REQUEST);
    }
}
