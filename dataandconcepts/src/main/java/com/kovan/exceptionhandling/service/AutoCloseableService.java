package com.kovan.exceptionhandling.service;

import com.kovan.exceptionhandling.model.Resource;
import org.springframework.stereotype.Service;

@Service
public class AutoCloseableService {
    public void tryWithResource(){
        try (Resource r= new Resource() ){
            r.read();

            // Throwing an exception explicitly
            throw new RuntimeException ("Error");

            // we didn't call close() here, but AutoClosable automatically calls it
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}

