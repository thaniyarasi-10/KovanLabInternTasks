package com.kovan.abstractionpractice;

interface Colour{
    void colourName();

    //only overriden in the class which implements this
    default void display(){
        System.out.println("Colours: ");
    }
}
class Red implements Colour{

    @Override
    public void display() {
        Colour.super.display();
        //can add arguments
        int a=10;
        int b= a*a;
        System.out.println(+b);
    }
    @Override
    public void colourName() {
        System.out.println("Red colour");
    }
}
class Blue implements Colour{
    @Override
    public void colourName() {
        System.out.println("Blue colour");
    }


}

public class UsingInterface {
    public static void main(String[] args) {
        Red red= new Red();
        Blue blue= new Blue();
        red.colourName();
        red.display();
        blue.colourName();

    }

}
