package com.test.example.circulardependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class TestBean {

    @Autowired
    private Car1 car1;
    @Autowired
    private Driver1 driver1;
    @PostConstruct
    public void init(){
        car1.drive();
        driver1.showCar();
    }
}
