package com.kovan.concurrencyandtooling.model;

class Main extends Thread {
    public void run() { //Executes automatically
        System.out.println("Thread is running"+currentThread().getName());

        try{
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void execute(){
        System.out.println("Execute is running "+currentThread().getName());
    }
    public void eg(){
        System.out.println("Eg is running "+currentThread().getName());
    }



}

public class  MyThread {
    public static void main(String[] args) {
        Main thread1 = new Main();
        Main thread2 = new Main();
        Main main = new Main();
        // thread1.run(); - runs as a normal method not as thread
        thread1.start(); // starts a new thread
        System.out.println(thread1.isAlive());

        thread2.start();
        thread2.execute();
        thread2.eg();
        System.out.println(main.isAlive());
        main.eg();// this is not a thread, so it always return false

    }
}

