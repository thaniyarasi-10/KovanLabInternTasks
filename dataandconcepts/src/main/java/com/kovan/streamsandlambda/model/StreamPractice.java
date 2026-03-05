package com.kovan.streamsandlambda.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.*;

public class StreamPractice {
    public static void main(String[] args) {
        //List.of() method is immutable, but we can give it in ArrayList to make it mutable
        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));
        list.set(1,10);
        list.remove(8);

        // forEach(System.out::print) only used for collections and streams
        list.forEach(System.out::println);

        //lazy evalution (code executes only when triggered/necessary)
        list.stream()
                .filter(n -> {
                    System.out.println("Filtering " + n);
                    return n > 3; // value returned to next operation in pipeline (to map)
                })
                .map(n -> {
                    System.out.println("Mapping " + n);
                    return n * 10; // return to forEach loop
                }) // until this the code will not execute, only after triggering it executes

                .forEach(System.out::println); // triggering the stream


        List<String> names = Arrays.asList("Amit", "Riya", "Rohan", "Amit");
        names.forEach(System.out::println);



        // Collect into Set from the list (removes duplicates)
        Set<String> uniqueNames = names.stream().collect(Collectors.toSet());
        System.out.println(uniqueNames);

        long count = names.stream().filter(a -> a.startsWith("R")).count();
        System.out.println("Names starting with R: " + count);

    }
}
