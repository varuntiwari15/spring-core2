package com.test.example.shortlivescopeinlonglivescope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class SingletonBean9 {  //run-9

    @Autowired
    private Function<String, PrototypeBean9> func;

    public void showMsg(){
        PrototypeBean9 prototypeBean9 = func.apply("need one prototype bean");
        System.out.println("current time from prototype bean: "+ prototypeBean9.getDateTime());
    }
}
