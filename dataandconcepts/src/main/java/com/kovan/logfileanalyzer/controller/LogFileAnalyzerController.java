package com.kovan.logfileanalyzer.controller;

import com.kovan.logfileanalyzer.service.LogFileAnalyzerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Map;

@RestController
@RequestMapping("/logs")
public class LogFileAnalyzerController {

    private final LogFileAnalyzerService logFileAnalyzerService;

    public LogFileAnalyzerController(LogFileAnalyzerService logFileAnalyzerService) {
        this.logFileAnalyzerService = logFileAnalyzerService;
    }

    // Generate log file
    @GetMapping("/generate")
    public String generateLogFile() {
        logFileAnalyzerService.createLogFile();
        return "Log file generated successfully";
    }

    //Analyze log file
    @GetMapping("/analyze")
    public Map<String, Object> analyzeLogFile() throws IOException {
        return logFileAnalyzerService.analyzeLogFile();
    }
}
