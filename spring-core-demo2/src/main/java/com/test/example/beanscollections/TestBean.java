package com.test.example.beanscollections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@Component
public class TestBean {

    @Autowired
    private String[] fruits;
    @Autowired
    private List<String> vegies;

    @PostConstruct
    public void postConstruct(){
        System.out.println(Arrays.toString(fruits));
        System.out.println(vegies);
    }
}
