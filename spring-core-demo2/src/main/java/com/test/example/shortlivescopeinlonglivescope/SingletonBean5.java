package com.test.example.shortlivescopeinlonglivescope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SingletonBean5 {  //run-5
    @Autowired
    private PrototypeBean5 prototypeBean5;

    public void showMessage(){
        System.out.println("current time from prototype bean : "+ prototypeBean5.getDateTime());
    }
}
