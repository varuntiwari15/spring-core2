package com.test.example.shortlivescopeinlonglivescope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.INTERFACES)
public class PrototypeBean6 implements IPrototypeBean6{  //run-6

    private String dateTimeString = LocalDateTime.now().toString();
    @Override
    public String getDateTime() {
        return dateTimeString;
    }
}
