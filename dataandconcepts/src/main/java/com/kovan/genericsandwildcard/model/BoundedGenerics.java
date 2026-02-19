package com.kovan.genericsandwildcard.model;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;


//upper bound - extends
public class BoundedGenerics<T extends Number> {

        T num;

        BoundedGenerics(T num) {
            this.num = num;
        }

//        Double square() {
//            return num * num; we cant perform '*' operation for Objects
//        }
    double square() {
        return num.doubleValue() * num.doubleValue();
        //doubleValue used to convert the value to double
    }


}

//Lower bound - super(only given in method)
class LowerBoundGenerics{
    public static void addIntegers(List<? super Integer> list) {
        list.add(new Integer(10)); // Valid
        //list.add(new Object()); Compile-time error, Object is a superclass, but adding arbitrary objects is unsafe
    }
    public static void addIntegers2(List<? extends Number> list) {
        // list.add(new Integer(10)); - error because we can't write in extends we can only read.
        Number num = list.get(0);
        System.out.println(num);
    }


}


class Main{
    public static void main(String[] args) {
        BoundedGenerics<Integer> value = new BoundedGenerics<Integer>(5);
        //BoundedGenerics<String> value2 = new BoundedGenerics<String>("Intern");
        System.out.println(value);
        System.out.println(value.square());
        //System.out.println(value2); // Error because String dosen't belong to Number class

        List<Number> list1 = new ArrayList<>();
//        List<Number> list2 = new ArrayList<>();
//        List<Object> list3 = new ArrayList<>();

        com.kovan.genericsandwildcard.model.LowerBoundGenerics.addIntegers(list1);
//        LowerBoundGenerics.addIntegers(list2);
//        LowerBoundGenerics.addIntegers(list3);

        System.out.println("After addIntegers:");
        System.out.println(list1);
//        System.out.println(list2);
//        System.out.println(list3);

        // 🔹 For Upper Bound (? extends Number)
        List<Integer> list4 = new ArrayList<>();
        list4.add(50);   // Must add before calling

        com.kovan.genericsandwildcard.model.LowerBoundGenerics.addIntegers2(list4);

    }
}




