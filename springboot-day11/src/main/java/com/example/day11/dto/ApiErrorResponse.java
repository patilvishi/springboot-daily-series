package com.example.day11.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class ApiErrorResponse {

    private final String errorCode;
    private final String message;
    private final LocalDateTime timestamp;
}
