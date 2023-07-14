package com.test.example.shortlivescopeinlonglivescope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PrototypeBean9 {  //run-9

    private String name;

    public PrototypeBean9(String name) {
        this.name = name;
    }

    private String dateTimeString = LocalDateTime.now().toString();

    public String getDateTime(){
        return dateTimeString;
    }
}
