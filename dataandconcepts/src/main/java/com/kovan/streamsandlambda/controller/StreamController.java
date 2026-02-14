package com.kovan.streamsandlambda.controller;

import com.kovan.streamsandlambda.service.StreamService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.IntSummaryStatistics;
@RestController
public class StreamController {
    private StreamService streamService;
    public StreamController (StreamService streamService){
        this.streamService= streamService;
    }
    @GetMapping("/stats")
    public IntSummaryStatistics getStreamService() {
        return streamService.computeStats();
    }
}
