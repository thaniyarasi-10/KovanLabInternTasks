package com.kovan.composition.service;


import org.springframework.stereotype.Service;

@Service
public class ProcessorService {

    public String processorType(String pt, int rt) {
        if ("GPU".equals(pt) && rt >= 8) {
            return "You can buy GPU";
        }
        return "You cannot buy GPU";
    }
}
