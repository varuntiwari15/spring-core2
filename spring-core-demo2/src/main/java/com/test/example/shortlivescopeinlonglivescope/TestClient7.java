package com.test.example.shortlivescopeinlonglivescope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class TestClient7 {  //run-7
    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TestClient7.class);
        SIngletonBean7 sIngletonBean7 = context.getBean(SIngletonBean7.class);
        sIngletonBean7.showMsg();
        Thread.sleep(4000);
        SIngletonBean7 sIngletonBean71 = context.getBean(SIngletonBean7.class);
        sIngletonBean71.showMsg();
        //output-7
        //current time from prototype bean : 2023-07-14T14:17:20.821175500
        //current time from prototype bean : 2023-07-14T14:17:24.828351
    }
}
