package com.KovanLearnings.Java;

public class StringConcepts {
    public static void main(String [] args){
        //String - immutable and thread safe
        String str1 = "Hello";
        str1=str1.concat("Intern");

        //StringBuilder - mutable, non - synchronous
        StringBuilder sb = new StringBuilder("39");
        System.out.println(sb.append("java"));


        //StringBuffer - mutable, synchronous
        StringBuffer sb1 = new StringBuffer("39");
        System.out.println(str1 + " "+ sb+ " "+sb1);


    }
}
