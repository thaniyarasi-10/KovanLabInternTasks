package com.kovan.concurrencyandtooling.controller;

import com.kovan.concurrencyandtooling.service.ThreadService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ThreadController {
    private final ThreadService threadService;
    public ThreadController(ThreadService threadService){
        this.threadService= threadService;
    }

    @GetMapping("/thread")
    public int getThreadService() throws InterruptedException {
        return threadService.incrementThread();
    }

}
