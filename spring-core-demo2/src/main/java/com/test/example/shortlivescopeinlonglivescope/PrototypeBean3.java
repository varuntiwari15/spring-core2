package com.test.example.shortlivescopeinlonglivescope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PrototypeBean3 {  //run-3

    private String dateTimeString = LocalDateTime.now().toString();

    public String getDateTime(){
        return dateTimeString;
    }
}
