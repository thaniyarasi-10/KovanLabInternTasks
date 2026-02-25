package com.kovan.concurrencyandtooling.service;

public class Counter {
    int count=0;
    synchronized void increment(){
        count++;
    }
}
