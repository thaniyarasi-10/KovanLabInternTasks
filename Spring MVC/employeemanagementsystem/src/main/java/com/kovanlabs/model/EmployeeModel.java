package com.kovanlabs.model;


public class EmployeeModel {
    private Long id;
    private String name;
    private String designation;

    public EmployeeModel(){

    }
    EmployeeModel(Long id, String name, String designation){
        this.id= id;
        this.name=name;
        this.designation= designation;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDesignation() {
        return designation;
    }
}
