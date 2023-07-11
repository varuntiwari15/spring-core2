package com.test.example.beanconditionalregistration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestBean {
    @Autowired
    private Country country;

    public void printCountryName(){
        System.out.println("Impl class name for country interface : "+country.getClass().getSimpleName());
        System.out.println("impl class toString() method : "+country.toString());
    }
}
