package com.kovan.streamsandlambda.model;



public class EmployeeModel {
    private String name;
    private String department;

    public EmployeeModel(String name, String department){
        this.name= name;
        this.department= department;
    }
    public String getName(){
        return name;
    }
    public String getDepartment(){
        return department;
    }
}
