package com.Kovan.OopArchitecturalThinking.Model;



public class Square extends Shape{
    private final double size;
    public Square(double size){
        this.size= size;
    }

    @Override
    public double area() {
        return size*size;
    }

}
