package com.kovanlabs.logginginterceptor.service;

import com.kovanlabs.logginginterceptor.model.LoggingModel;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class LoggingService {

    private static final String file = "LOGFILE";
    public void logFile(LoggingModel loggingModel){
        try(BufferedWriter bufferedWriter= new BufferedWriter(new FileWriter("LOGFILE"))) {
            bufferedWriter.write(loggingModel.toString());
            bufferedWriter.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
