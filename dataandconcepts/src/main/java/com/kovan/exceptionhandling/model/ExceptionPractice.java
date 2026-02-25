package com.kovan.exceptionhandling.model;

public class ExceptionPractice {
    public static void main(String[] args) {
        try {
            int a = Integer.parseInt("ABC"); // NumberFormatException
            int b = 10 / 0;                  // ArithmeticException


        }
        // catch (NumberFormatException | Exception ex) this will cause compile time error, bcoz Exception is parent class and all other exceptions can be handled here
        // can write as many exception types as you want in a multi-catch block
        // Either exception can occur

        catch (NumberFormatException | ArithmeticException | NullPointerException ex) {
            System.out.println("Exception caught: " + ex);
        }
    }
}
