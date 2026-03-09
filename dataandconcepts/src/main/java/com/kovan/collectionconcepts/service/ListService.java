package com.kovan.collectionconcepts.service;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

import org.springframework.stereotype.Service;

@Service
public class ListService {
    public String compareGetPerformance() {
        int length = 1000000;
        int middle = length/2;
        List <Integer> arraylist = new ArrayList<>();
        List <Integer> linkedlist = new LinkedList<>();
        
        for (int i=0;i< length;i++){
            arraylist.add(i);
            linkedlist.add(i);
        }
        

        //nanoTime() is used to measure the time taken by the program to execute

        long start = System.nanoTime();
        arraylist.get(middle);
        long end = System.nanoTime();

        long start1 = System.nanoTime();
        linkedlist.get(middle);
        long end1 = System.nanoTime();
        return "ArrayList get time: " + (end - start) + " ns\r\n" + "LinkedList get time: " + (end1 - start1) + " ns";
        

        // If we give the same start and end values to both the lists, it will return the value of the linked list because, it overwrites the start and end values of the arraylist
        // long start = System.nanoTime();
        // int a=arraylist.get(middle);
        // long end = System.nanoTime();

        // start = System.nanoTime();
        // int b=linkedlist.get(middle);
        // end = System.nanoTime();
        // return "ArrayList get time: " + (end - start) + " ns\n" + "LinkedList get time: " + (end - start) + " ns";
        
    }
}

//http://localhost:8080/list-performance


