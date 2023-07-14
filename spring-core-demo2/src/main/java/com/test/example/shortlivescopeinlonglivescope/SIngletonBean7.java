package com.test.example.shortlivescopeinlonglivescope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.inject.Provider;

@Component
public class SIngletonBean7 {  //run-7
    @Autowired
    private Provider<PrototypBean7> provider;

    public void showMsg(){
        PrototypBean7 prototypBean7 = provider.get();
        System.out.println("current time from prototype bean : "+ prototypBean7.getDateTime());
    }
}
