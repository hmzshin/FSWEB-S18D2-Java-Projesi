package com.workintech.s18d2.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalExceptionHandler {
    @SuppressWarnings("null")
    @ExceptionHandler(FruitException.class)
    public ResponseEntity<ExceptionResponse> handleFruitException(FruitException fruitException) {
        ExceptionResponse globalExceptionResponse = new ExceptionResponse(fruitException.getStatus(),
                fruitException.getMessage(),
                LocalDateTime.now());
        return new ResponseEntity<>(globalExceptionResponse, fruitException.getStatus());
    }

    @SuppressWarnings("null")
    @ExceptionHandler(VegetableException.class)
    public ResponseEntity<ExceptionResponse> handleVegetableException(VegetableException vegetableException) {
        ExceptionResponse globalExceptionResponse = new ExceptionResponse(vegetableException.getStatus(),
                vegetableException.getMessage(),
                LocalDateTime.now());
        return new ResponseEntity<>(globalExceptionResponse, vegetableException.getStatus());
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ExceptionResponse> handleException(Exception exception) {
        ExceptionResponse errorResponse = new ExceptionResponse(HttpStatus.INTERNAL_SERVER_ERROR,
                exception.getMessage(),
                LocalDateTime.now());
        return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
