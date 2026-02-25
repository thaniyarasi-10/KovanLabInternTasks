package com.kovan.inheritancepractice;

interface Student{
    void studentDetails(String name, int rollNo);
}
interface Professor{
    void professorDetails(String name, int id );
}

class Department implements Student, Professor{
    @Override
    public void studentDetails(String name, int rollNo) {
        System.out.println("Name: "+ name);
        System.out.println("RollNo: "+rollNo);
    }

    @Override
    public void professorDetails(String name, int id) {
        System.out.println("Name: "+ name);
        System.out.println("RollNo: "+id);
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Department department= new Department();
        department.professorDetails("Raja", 123);
        department.studentDetails("Thani", 2265);
    }
}
