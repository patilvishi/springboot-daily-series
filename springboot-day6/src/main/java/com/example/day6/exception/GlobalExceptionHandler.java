package com.example.day6.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(InvalidOrderException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String, String> handle(InvalidOrderException ex) {
        return Map.of("error", ex.getMessage());
    }
}
