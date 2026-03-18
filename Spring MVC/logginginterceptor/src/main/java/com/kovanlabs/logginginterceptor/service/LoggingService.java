package com.kovanlabs.logginginterceptor.service;

import com.kovanlabs.logginginterceptor.model.LoggingModel;
import org.springframework.stereotype.Service;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

@Service
public class LoggingService {

    public void logFile(LoggingModel log) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("LOGFILE.txt", true))) {
            bw.write(log.toString());
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}