package com.kovan.collectionconcepts.controller;

import com.kovan.collectionconcepts.service.ListService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListController {

    private final ListService listService;

    public ListController(ListService listService) {
        this.listService = listService;
    }

    @GetMapping("/list-performance")
    public String compareListPerformance() {
        return listService.compareGetPerformance();
    }
}
