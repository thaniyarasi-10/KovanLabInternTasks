package com.kovan.genericsandwildcard.model;


@SuppressWarnings("unchecked")


public class MyStack<T>{
    private T arr[];
    private int capacity;
    private int top;

    public MyStack(int capacity){
        this.capacity= capacity;
        this.arr = (T[])new Integer[capacity];
        this.top = -1;
    }

    public void push(T value){
        if( top == capacity){
            resize();
        }
        arr[++top] = value;
    }

    public T pop(){
        if(top == -1){
            throw new RuntimeException("Stack is empty");
        }
        return arr[top--];
    }

    public T peek(){
        if(top == -1){
            throw new RuntimeException("Stack is empty");
        }
        return arr[top];
    }

    public void resize(){
        capacity *= 2;
        T[] newArr =(T[]) new Object[capacity];
        for(int i=0;i<= top;i++){
            newArr[i]=arr[i];
        }
        arr = newArr;
    }


}