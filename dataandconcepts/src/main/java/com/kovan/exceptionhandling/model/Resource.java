package com.kovan.exceptionhandling.model;

import java.lang.AutoCloseable;


// When creating a new Resource, must implement  AutoCloseable
public class Resource implements AutoCloseable {
    public void read() {
        System.out.println("Reading the file");
    }

    @Override
    public void close() {
        System.out.println("Close automatically called");
    }
}
