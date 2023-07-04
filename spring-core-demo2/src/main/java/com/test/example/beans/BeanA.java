package com.test.example.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
@Component()
public class BeanA {
    public BeanA() {
        System.out.println("beanA constructor");
    }


    @PostConstruct  // using bean life cycle with javax annotations
    public void myPostConstruct(){
        System.out.println("BeanA Post construct method");
    }

    @PreDestroy
    public void myPreDestroy(){
        System.out.println("BeanA Pre Destroy method");
    }
}
