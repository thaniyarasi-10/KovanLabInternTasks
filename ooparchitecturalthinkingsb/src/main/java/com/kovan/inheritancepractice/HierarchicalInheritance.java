package com.kovan.inheritancepractice;


// Hierarchical - many child class extends same parent
class Animal{
    public void sound() {
        System.out.println("Sound of the animal");
    }
}
class Dog extends Animal{
    Dog(){
        System.out.println("Dog class");
    }
    public void sound() {
        System.out.println("Dog Barks");
    }
}

class Cat extends Animal{
    Cat(){
        System.out.println("Cat class");
    }
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class HierarchicalInheritance extends Animal{
    public void call(){
        sound();
    }
    public static void main(String[] args) {
        System.out.println("Animals");
        HierarchicalInheritance hierarchicalInheritance = new HierarchicalInheritance();
        hierarchicalInheritance.call();

        Cat cat= new Cat();
        Dog dog = new Dog();





    }
}
