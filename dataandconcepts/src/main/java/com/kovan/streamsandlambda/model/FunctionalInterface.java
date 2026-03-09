package com.kovan.streamsandlambda.model;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class FunctionalInterface {
    public static void main(String[] args) {

        List<Integer> age= new ArrayList<>(List.of(18,30,57,99));

        // PREDICATE - returns boolean for a condition

        Predicate<Integer> isAdult = n -> n >=18 ;
        Predicate<Integer> isWorkingAge = n -> n<=60;

        //Predicate Chaining
        Predicate<Integer> isValid = isAdult.and(isWorkingAge);

        //test() - used to check the condition
        System.out.println(isAdult.test(10)); // false
        System.out.println(isWorkingAge.test(47));  // true

        age.stream()
                .filter(isValid)
                .forEach(System.out::println);


        //CONSUMER - takes the value , process it and return nothing

        Consumer<String> print = a ->System.out.println(a);
        Consumer<Integer> printI = a ->System.out.println(a);
        Consumer<String> length = a -> System.out.println(a.length());

        // Consumer Chaining -andThen()
        Consumer<String > combined = print.andThen(length);

        // accept()- used to pass the value and process
        combined.accept("Java");

        List<Integer> list = new ArrayList<>(List.of(1,2,3));
        list.forEach(printI);

        List<String> names = List.of("Ram", "Arun", "Anu");
        Consumer<String> printNames =System.out::println ; //we can also use  n-> System.out.println(n)
        names.stream()
                .filter(n -> n.startsWith("A"))
                .forEach(printNames);

        //FUNCTION - convert data from one form to another, used for conversion or transformation

        Function<String, Integer> lengthFunc = s -> s.length();
        names.stream()
                .map(lengthFunc)
                .forEach(System.out::println);
    }
}
