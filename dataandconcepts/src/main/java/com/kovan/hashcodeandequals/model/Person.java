package com.kovan.hashcodeandequals.model;

import java.util.Objects;

public class Person {
    private int id;
    private String name;
    
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;

        Person person = (Person) obj;
        return id == person.id && Objects.equals(name, person.name);

    }

    @Override
    public int hashCode(){
        return Objects.hash(id, name);
    }

    // If hashCode() not overriden, map.get(p2) will return null
    // because hashcode of p1 and p2 will be different
}

