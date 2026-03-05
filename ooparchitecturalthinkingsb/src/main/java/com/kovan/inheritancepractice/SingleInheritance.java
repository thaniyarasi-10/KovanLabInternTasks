package com.kovan.inheritancepractice;

class Calculator {
    public void calculator(){
        System.out.println("Calculator");
    }
}
class Add extends Calculator{
    public int addInt(int... num)  {
        calculator();
        int sum=0;
        for(int i: num){
            sum += i;
        }
        return sum;
    }

}


public class SingleInheritance {
    public static void main(String[] args) {

        //need to create object if not extend
        Add add = new Add();
        System.out.println(add.addInt(2,3,5,6));
    }

}
