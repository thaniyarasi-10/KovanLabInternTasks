package com.kovan.enumtask.service;

public enum Operation {
    ADD{
        @Override
        public double apply (double x, double y){
            return x+y;
        }
    },
    SUBTRACT{
        @Override
        public double apply (double x, double y){
            return x-y;
        }
    },
    MULTIPLY{
        @Override
        public double apply (double x, double y){
            return x*y;
        }
    };
    public abstract double apply (double x, double y);
}
