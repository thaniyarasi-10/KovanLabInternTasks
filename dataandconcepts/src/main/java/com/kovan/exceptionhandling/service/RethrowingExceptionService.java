package com.kovan.exceptionhandling.service;

import com.kovan.exceptionhandling.model.DataProcessingException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

@Service
public class RethrowingExceptionService {
    public void reThrow(){
        try(BufferedReader bufferedReader =  new BufferedReader(new InputStreamReader(new ClassPathResource("data.txt").getInputStream()))){
            System.out.println("Reading the file");
            throw new DataProcessingException("Data processing failed");
        } catch (Exception e) {
                System.out.println(e.getMessage());
        }
    }
}
