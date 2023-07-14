package com.test.example.shortlivescopeinlonglivescope;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SingletonBean8 {  //run-8
    @Autowired
    private ObjectProvider<PrototypeBean8> objectProvider;

    public void showMsg(){
        PrototypeBean8 prototypeBean8 = objectProvider.getIfAvailable(() -> new PrototypeBean8());
        System.out.println("current time from prototype bean : "+ prototypeBean8.getDateTime());
    }

}
