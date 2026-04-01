package com.kovan.genericsandwildcard.controller;

import com.kovan.genericsandwildcard.service.WildcardSumService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sum")
public class WildcardSumController {

    private final WildcardSumService wildCardSumService;

    public WildcardSumController(WildcardSumService wildCardSumService) {
        this.wildCardSumService = wildCardSumService;
    }

    @PostMapping
    public double sumNumbers(@RequestBody List<Double> list) {
        return wildCardSumService.sumList(list);
    }
}
