package com.kovan.genericsandwildcard.controller;

import com.kovan.genericsandwildcard.service.MyStackService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/stack")
public class MyStackController{
    private final MyStackService myStack;

    public MyStackController(MyStackService myStack) {
        this.myStack = myStack;
    }

    @PostMapping("/push")
    public String push(@RequestParam Integer value){
        myStack.push(value);
        return "Pushed";
    }

    @GetMapping("/pop")
    public Integer pop(){
        return myStack.pop();
    }

    @GetMapping("/peek")
    public Integer peek(){
        return myStack.peek();
    }
// http://localhost:8080/stack/peek

}
