package com.kovan.genericsandwildcard.service;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class WildcardSumService {

    public double sumList(List<? extends Number> list) {
        double sum = 0.0;
        for (Number number : list) {
            sum += number.doubleValue();
        }
        return sum;
    }
}


//POST http://localhost:8080/sum


