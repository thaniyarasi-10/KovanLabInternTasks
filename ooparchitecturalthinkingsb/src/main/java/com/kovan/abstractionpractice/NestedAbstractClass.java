package com.kovan.abstractionpractice;


class Smartphone{
    String modelName;
    Smartphone(String modelName){
        this.modelName= modelName;
    }

    public void getModelName() {
        System.out.println("Model name: "+ modelName);
    }

    abstract class Security{
        abstract void unlock();
    }
}

class AndroidPhone extends Smartphone{
    AndroidPhone(String name){
        // calling parent class constructor, if not compile time error
        super(name);
    }
    class FingerPrint extends Security{
        @Override
        void unlock() {
            System.out.println("Use Finger print to unlock");
        }
    }
    class FaceLock extends Security{
        @Override
        void unlock() {
            System.out.println("Verify Face to unlock ");
        }
    }

}

class iPhone extends Smartphone{
    iPhone(String name){
        super(name);
    }
    class FaceLock extends Security{
        @Override
        void unlock() {
            System.out.println("Verify Face to unlock ");
        }
    }

}



public class NestedAbstractClass {
    public static void main(String[] args) {
        AndroidPhone androidPhone1 = new AndroidPhone("Oppo");
        androidPhone1.getModelName();
        AndroidPhone.FaceLock faceLock = androidPhone1.new FaceLock();
        faceLock.unlock();


        AndroidPhone androidPhone2 = new AndroidPhone("Samsung");
        androidPhone2.getModelName();
        AndroidPhone.FingerPrint fingerPrint= androidPhone2.new FingerPrint();
        fingerPrint.unlock();


        iPhone iphone1 = new iPhone("iPhone 17");
        iphone1.getModelName();
        iPhone.FaceLock faceLock1 = iphone1.new FaceLock();
        faceLock1.unlock();

    }
}
