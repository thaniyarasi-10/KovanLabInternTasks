package com.kovan.enumtask.controller;


import com.kovan.enumtask.service.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnumController {
    
    @GetMapping("/calculate")
    public double calculate(
        @RequestParam double a ,
        @RequestParam double b,
        @RequestParam Operation operation

    )
    {return operation.apply(a, b);}
}


//http://localhost:8080/calculate?a=10&b=5&operation=ADD