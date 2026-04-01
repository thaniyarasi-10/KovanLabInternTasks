package com.kovanlabs.logginginterceptor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoggingController {

    @GetMapping("")
    public String hello() {
        return "hello";
    }
}
