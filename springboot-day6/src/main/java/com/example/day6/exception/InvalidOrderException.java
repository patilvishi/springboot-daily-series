package com.example.day6.exception;

public class InvalidOrderException extends RuntimeException {
    public InvalidOrderException(String msg) {
        super(msg);
    }
}
