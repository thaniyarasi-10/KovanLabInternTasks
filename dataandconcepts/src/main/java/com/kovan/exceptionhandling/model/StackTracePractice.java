package com.kovan.exceptionhandling.model;

// Stack trace- a list of the method name and the execution order, before the error happened.
//StackTraceElement is a class that represents ONE line in a stack trace. It contains StackTraceElement(String declaringClass, String methodName, String fileName, int lineNumber)
// When an exception occurs, Java records where the error happened in StackTraceElement

public class StackTracePractice {
    public static void main(String[] args) {

        try {
            methodA();
        } catch (Exception e) {

            StackTraceElement[] stack = e.getStackTrace();

            for (StackTraceElement element : stack) {
                System.out.println("Class Name  : " + element.getClassName());
                System.out.println("Method Name : " + element.getMethodName());
                System.out.println("File Name   : " + element.getFileName());
                System.out.println("Line Number : " + element.getLineNumber());
            }
        }
    }

    static void methodA() {
        methodB();
    }

    static void methodB() {
        int a = 10 / 0; // ArithmeticException
    }
}
