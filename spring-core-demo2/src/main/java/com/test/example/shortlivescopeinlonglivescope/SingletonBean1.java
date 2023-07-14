package com.test.example.shortlivescopeinlonglivescope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SingletonBean1 {  //run-1
    @Autowired
    private PrototypeBean1 prototypeBean1;

    public void showMessage(){
        System.out.println("current time from prototype bean is : "+ prototypeBean1.getDateTime());
    }
}
