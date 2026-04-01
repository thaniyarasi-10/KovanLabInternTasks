package com.kovanlabs.logginginterceptor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoggingController {

    @GetMapping("/home")
    public String home() {
        return "home";
    }
}
