package com.KovanLearnings.Java;

class MemoryPrimitivesWrappers
{

    public static void MemoryTest(){
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

        //same ref for s1, s2 nad different ref for s3
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        System.out.println(System.identityHashCode(s3));

    }
    public static void Overflow(){
        byte a=125;
        for (int i=0;i<10;i++){
            System.out.println(a++);
        }
    }
    public static void main(String args[])
    {
        MemoryTest();
        Overflow();
    }
}
