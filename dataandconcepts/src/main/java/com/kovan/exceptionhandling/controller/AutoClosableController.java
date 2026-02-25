package com.kovan.exceptionhandling.controller;

import com.kovan.exceptionhandling.service.AutoCloseableService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class AutoClosableController {
    private  AutoCloseableService autoCloseableService;
    AutoClosableController (AutoCloseableService autoCloseableService){
        this.autoCloseableService= autoCloseableService;
    }

    @GetMapping("/autoclose")
    public String runAutoClose(){
        autoCloseableService.tryWithResource();
        return "Try-with-resource executed";
    }
}

//http://localhost:8080/autoclose