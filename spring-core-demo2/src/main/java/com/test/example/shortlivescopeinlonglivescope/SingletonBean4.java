package com.test.example.shortlivescopeinlonglivescope;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class SingletonBean4 {  //run-4

    @Lookup
    public PrototypeBean4 getPrototypeBean(){
        return null; //spring will override this method with CGLIB
    }
    // dynamically generated code with @Lookup method
    //public MyPrototypeBean getPrototypeBean(){
    //    return applicationContext.getBean(MyPrototypeBean.class);
   // }

    public void showMessage(){
        PrototypeBean4 bean = getPrototypeBean();
        System.out.println("current time from prototype bean : "+ bean.getDateTime());
    }
}
