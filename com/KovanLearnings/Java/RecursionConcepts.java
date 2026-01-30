package com.KovanLearnings.Java;

public class RecursionConcepts {
    public static int stackOverflowClass(int n){
        // no termination, shows stackOverflowError
        return  n+ stackOverflowClass(n+2);
    }
    public static void main(String [] args) {
        int n=2;
        stackOverflowClass(n);
    }
}
