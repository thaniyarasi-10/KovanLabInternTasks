package com.kovan.genericsandwildcard.service;

import com.kovan.genericsandwildcard.model.MyStack;
import org.springframework.stereotype.Service;

@Service
public class MyStackService {
    private final MyStack<Integer> stack = new MyStack<>(10);
    public void push(Integer value){
        stack.push(value);
    }

    public Integer pop(){
        return stack.pop();
    }

    public Integer peek(){
        return stack.peek();
    }



}
