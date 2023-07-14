package com.test.example.shortlivescopeinlonglivescope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class PrototypeBean5 {  //run-5

    private String dateTimeString = LocalDateTime.now().toString();

    public String getDateTime(){
        return dateTimeString;
    }
}
