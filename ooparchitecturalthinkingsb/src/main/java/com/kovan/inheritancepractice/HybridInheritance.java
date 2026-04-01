package com.kovan.inheritancepractice;
//Hybrid Inheritance- combination of 2 or more type of Inheritance

interface Engine{
    void hasEngine();
    default void engineInfo() {
        System.out.println("Engine has 10 year warranty");
    }
}

interface Tyre{
    void hasTyre();
    default void tyreInfo() {
        System.out.println("This is a strong tyre");
    }
}

class VehicleModel implements Engine , Tyre { // multipleInheritance
    VehicleModel() {
        System.out.println("2 wheeler and 4 wheeler");
    }
    @Override
    public void hasEngine() {
        System.out.println("Vehicle has engine");
    }

    @Override
    public void hasTyre() {
        System.out.println("Vehicle has tyre");
    }
}
// Multilevel inheritance
class Car extends VehicleModel {
    Car(){
        System.out.println("BMW");
    }


}
class Bike extends VehicleModel{
    Bike(){
        System.out.println("Splender");
    }

}

public class HybridInheritance {
    public static void main(String[] args) {
        VehicleModel vehicleModel= new VehicleModel();
        vehicleModel.hasEngine();
        vehicleModel.hasTyre();

        // calling interface methods
        vehicleModel.engineInfo();
        vehicleModel.tyreInfo();

        Car car= new Car();
        Bike bike= new Bike();
    }
}
