package com.kovan.interfacepractice;



interface Vehicle{
    default void engine(){
        System.out.println("Engine");
    }
}

class Car{
    public void engine(){
        System.out.println("Car Engine");
    }
}
public class MultipleInterface extends Car implements Vehicle{

    public static void main(String[] args) {
        System.out.println("Main method");

        MultipleInterface multipleInterface= new MultipleInterface();
        multipleInterface.engine(); //class - first rule, engine method in class Car will execute coz it is overriden
    }
}
