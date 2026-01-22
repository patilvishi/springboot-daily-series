package com.example.day11.exception;

import com.example.day11.dto.ApiErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(OrderNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ApiErrorResponse handleNotFound(OrderNotFoundException ex) {
        return new ApiErrorResponse(
                "ORDER_NOT_FOUND",
                ex.getMessage(),
                LocalDateTime.now()
        );
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ApiErrorResponse handleGeneric(Exception ex) {
        return new ApiErrorResponse(
                "INTERNAL_ERROR",
                "Something went wrong",
                LocalDateTime.now()
        );
    }
}
