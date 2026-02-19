package com.kovan.exceptionhandling.model;

public class DataProcessingException extends RuntimeException {
    public DataProcessingException (String message){
        super (message);
    }
}
