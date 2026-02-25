package com.kovan.composition.controller;

import com.kovan.composition.service.ComputerService;
import com.kovan.composition.service.ProcessorService;
import com.kovan.composition.service.StorageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ComputerController {

    private final ComputerService computerService;
    private final ProcessorService processorService;
    private final StorageService storageService;

    public ComputerController(
            ComputerService computerService,
            ProcessorService processorService,
            StorageService storageService) {

        this.computerService = computerService;
        this.processorService = processorService;
        this.storageService = storageService;
    }

    @GetMapping("/computer")
    public String computerInfo(@RequestParam int newRam) {

        int currentRam = computerService.getRam();

        //returning all the input

        return "Current RAM: " + currentRam + " GB\n" +
                processorService.processorType("GPU", currentRam) + "\n" +
                "Storage: " + storageService.storageType() + " GB\n" +
                computerService.upgradeRam(newRam);
    }
}
