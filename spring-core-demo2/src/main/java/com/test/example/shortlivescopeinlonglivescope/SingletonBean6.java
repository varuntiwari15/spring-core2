package com.test.example.shortlivescopeinlonglivescope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SingletonBean6 {  //run-6

    @Autowired
    private IPrototypeBean6 iPrototypeBean6;

    public void showMessage(){
        System.out.println("current time from prototype bean : "+ iPrototypeBean6.getDateTime());
    }
}
