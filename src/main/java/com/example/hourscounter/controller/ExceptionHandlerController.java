package com.example.hourscounter.controller;

import jakarta.validation.ConstraintViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

@ControllerAdvice
public class ExceptionHandlerController {

    @ExceptionHandler(
            ConstraintViolationException.class
    )
    public ResponseEntity<ErrorResponse> constraintHandler(Throwable th) {
        ErrorResponse response = ErrorResponse.builder(th, BAD_REQUEST, th.getMessage()).build();
        return new ResponseEntity<>(response, BAD_REQUEST);
    }
}