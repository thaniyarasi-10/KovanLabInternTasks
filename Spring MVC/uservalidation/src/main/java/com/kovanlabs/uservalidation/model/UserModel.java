package com.kovanlabs.uservalidation.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;


public class UserModel {

    @NotEmpty(message="Name cannot be empty")
    private String name;

    @NotEmpty(message="Email cannot be empty")
    @Email(message="Enter a valid email")
    private String email;

    @Min(value=18, message="Age must be at least 18")
    @Max(value=60, message="Age must be below 60")
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}