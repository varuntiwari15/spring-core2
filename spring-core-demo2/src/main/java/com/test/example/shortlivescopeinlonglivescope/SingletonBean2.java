package com.test.example.shortlivescopeinlonglivescope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class SingletonBean2 {  //run-2
  //  @Autowired
  //  private PrototypeBean2 prototypeBean2;
    @Autowired
    private ApplicationContext applicationContext;

    public void showMessage(){
        PrototypeBean2 prototypeBean2 = applicationContext.getBean(PrototypeBean2.class);
        System.out.println("current time from prototype bean : "+
                prototypeBean2.getDateTimeData());
    }


}
