package com.KovanLearnings.OopArchitecturalThinking;

public class ObjectCounter {
    static int counter =0;
    ObjectCounter(){
        counter++;
    }
    public static void main(String []args){
        new ObjectCounter();
        System.out.println(ObjectCounter.counter);
        new ObjectCounter();
        System.out.println(ObjectCounter.counter);
        new ObjectCounter();
        System.out.println(ObjectCounter.counter);
    }
}
