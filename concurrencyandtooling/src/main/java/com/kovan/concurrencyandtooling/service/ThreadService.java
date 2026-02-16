package com.kovan.concurrencyandtooling.service;

import org.springframework.stereotype.Service;

@Service
public class ThreadService{
  public int  incrementThread() throws InterruptedException {
      Counter counter= new Counter();
      Thread[] threads = new Thread[10];
              for (int i=0;i<10;i++){
            threads[i] = new Thread(
                    () -> {
                        for (int j = 0; j < 1000; j++) {
                            counter.increment();
                        }
                    }
            );
        }
      for(Thread thread : threads){
           thread.start();
        }
              for(Thread thread : threads){
            thread.join();
        }
      return counter.count;
  }

}
