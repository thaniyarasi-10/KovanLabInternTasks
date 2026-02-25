package com.kovan.abstractionpractice;

// can contain many methods, abstract method is not compulsory
abstract class Department{
    static void dptName(String dpt){
        System.out.println("Department name: "+ dpt);
    }
    int noOfDpt=15;
    abstract int deptCount(int noOfDpt);
}


public class UsingAbstractClass extends Department{
    int deptCount(int noOfDpt){
        return noOfDpt;
    }
    public static void main(String[] args) {
        System.out.println("Using abstract class");
        dptName("BME");
        UsingAbstractClass usingAbstractClass= new UsingAbstractClass();
        System.out.println(usingAbstractClass.deptCount(usingAbstractClass.noOfDpt));
    }
}
