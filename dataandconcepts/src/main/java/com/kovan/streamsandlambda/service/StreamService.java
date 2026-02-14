package com.kovan.streamsandlambda.service;


import org.springframework.stereotype.Service;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;

@Service
public class StreamService {
    public IntSummaryStatistics computeStats(){
        List <Integer> list = new Random()
                .ints(100,0,100)
                .boxed()
                .toList();

        return list.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();
    }
}
