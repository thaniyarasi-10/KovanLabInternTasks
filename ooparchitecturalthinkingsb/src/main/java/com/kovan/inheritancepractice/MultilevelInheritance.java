package com.kovan.inheritancepractice;

// Multilevel Inheritance - a child class extends another child class which extends parent class
class Calculator1 {
    Calculator1() {
        System.out.println("Calculator1 executed");
    }
    public static void calculator(){
        System.out.println("Calculator");
    }
}
class Add1 extends Calculator1{
    Add1(){
        System.out.println("Add1 executed");
    }
    public  int addInt(int... num)  {
        calculator();
        int sum=0;
        for(int i: num){
            sum += i;
        }
        return sum;
    }

    public  int addInt(int a, int b){
        return a+b;
    }


    public double addInt(double... num){
        double sum=0;
        for(double i: num){
            sum += i;
        }
        return sum;
    }
}
class AddTwoNum extends Add1{

    AddTwoNum(){
        System.out.println(" AddTwoNum executed");
    }

    // only this method is overridden, coz it has the same name and parameter as the parent class
    public int addInt(int a, int b){
        return a+b;
    }
    public static double addInt(double a, double b){
        return a+b;
    }
}


public class MultilevelInheritance extends AddTwoNum{
    MultilevelInheritance(){
        System.out.println("MultilevelInheritance executed");
    }

    public void call(){
        System.out.println(addInt(1,2,3,4));
        System.out.println(addInt(1.0,2.0));
        Add1.calculator();
    }
    public static void main(String[] args) {
        // within a static method, we can only call a static method without creating object, but we must create an obj to call a non-static method
        addInt(1.0,2.0);
        MultilevelInheritance multilevelInheritance = new MultilevelInheritance();
//        multilevelInheritance.call();
        multilevelInheritance.addInt(1,2);


    }

}
