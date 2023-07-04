package com.test.example.beans;

public class BeanA2 {
    public BeanA2() {
        System.out.println("BeanA2 constructor");
    }

    public void myInit(){
        System.out.println("myinit method for spring @Bean param initMethod");
    }

    public void myDestroy(){
        System.out.println("myDestroy method for spring @Bean param destroyMethod");
    }
}
