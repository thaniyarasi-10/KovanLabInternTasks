package com.kovanlabs.globalexceptionhandler.exception;

public class MethodArgumentNotvalidException extends RuntimeException {
    public MethodArgumentNotvalidException(String message) {
        super(message);
    }
}