package com.kovan.interfacepractice;

// method conflict - same method name in different interface
interface Engine{
    default void car(){
        System.out.println("Car Engine");
    }
}

interface Tyre{
    default void car(){
        System.out.println("Car tyre");
    }
}
public class MethodConflict implements Engine,Tyre{
    //must override when multiple interfaces define the same default method
    public  void car() {
        Engine.super.car(); // explicitly call Engine's default method
        Tyre.super.car();
    }

    public static void main(String[] args) {
        System.out.println("Main method");
        MethodConflict methodConflict= new MethodConflict();
        methodConflict.car();
    }
}
