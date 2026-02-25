//package com.kovan.inheritancepractice;
//
//class Parent {
//    static void display() {
//        System.out.println("Parent");
//    }
//}
//
//class Child extends Parent {
//    static void display() {
//        System.out.println("Child");
//    }
//}
//public class staticMethodOverride {
//
//    public static void main(String[] args) {
//        Parent parent =  new Child();
//        Child child = new Child();
//        child.display(); //op: child
//        parent.display();//op: parent coz, static method cannot be overriden (static method belongs to class not object
//
//
//    }
//
//}


package com.kovan.inheritancepractice;

class Parent {
     void display() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
     void display() {
        System.out.println("Child");
    }
}
public class staticMethodOverride {

    public static void main(String[] args) {
        Parent parent =  new Child();
        Child child = new Child();
        child.display(); //op: child
        parent.display();//op: child


    }

}
