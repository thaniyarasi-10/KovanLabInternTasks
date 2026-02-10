package com.kovan.hashcodeandequals.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.kovan.hashcodeandequals.model.Person;


@Service
public class PersonService {
    public String testHashMap(){
        Map <Person,String> map = new HashMap<>();

        Person p1= new Person(1, "Thani");
        Person p2= new Person(1, "Thani");

        map.put(p1,"Intern");

        return p1.equals(p1) + "\n" + map.get(p1) + "\n" + map.get(p2);

    }
}
