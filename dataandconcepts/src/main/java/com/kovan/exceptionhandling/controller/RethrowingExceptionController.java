package com.kovan.exceptionhandling.controller;

import com.kovan.exceptionhandling.service.RethrowingExceptionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RethrowingExceptionController {

    private final RethrowingExceptionService rethrowingExceptionService;

    public RethrowingExceptionController(RethrowingExceptionService rethrowingExceptionService) {
        this.rethrowingExceptionService = rethrowingExceptionService;
    }

    @GetMapping("/rethrow")
    public String rethrowException() {
        rethrowingExceptionService.reThrow();
        return "Rethrowing exception logic executed";
    }
}
