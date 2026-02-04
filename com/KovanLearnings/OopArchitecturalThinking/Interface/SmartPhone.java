package com.KovanLearnings.OopArchitecturalThinking.Interface;

interface Camera{
    void display();
    void picture();
}
interface MusicPlayer{
    void display();
    void music();
}
interface Phone{
    void display();
    void call();
}

public class SmartPhone implements Camera,MusicPlayer,Phone {
    @Override
    public void display(){
        System.out.println("Display method");
    }
    @Override
    public void picture(){
        System.out.println("Picture method");
    }
    @Override
    public void music(){
        System.out.println("Music method");
    }
    @Override
    public void call(){
        System.out.println("Call method");
    }
    public static void main(String[] args) {
        SmartPhone smartPhone= new SmartPhone();

        smartPhone.display();
        smartPhone.picture();
        smartPhone.music();
        smartPhone.call();
    }
}
