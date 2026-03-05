package com.kovanlabs.registrationform.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class RegistrationFormModel {
    @Id
    private int id;
    private String name;
    private String email;
    private String password;

    public RegistrationFormModel() {

    }
    
    public RegistrationFormModel(int id, String name, String email, String password){
        this.id= id;
        this.name=name;
        this.email= email;
        this.password= password;
    }



    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
