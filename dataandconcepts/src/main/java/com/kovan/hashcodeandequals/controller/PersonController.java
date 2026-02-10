package com.kovan.hashcodeandequals.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kovan.hashcodeandequals.service.PersonService;

@RestController
public class PersonController {
    
    private PersonService personService;

    public PersonController(PersonService personService){
        this.personService = personService;
    }

    @GetMapping("/test")
    public String testHashMap(){
        return personService.testHashMap();
    }
}

//http://localhost:8080/test

// op 
// true
// Intern
// Intern

