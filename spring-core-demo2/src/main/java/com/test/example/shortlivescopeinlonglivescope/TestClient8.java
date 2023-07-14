package com.test.example.shortlivescopeinlonglivescope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class TestClient8 {  //run-8
    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TestClient8.class);
        SingletonBean8 singletonBean8 = context.getBean(SingletonBean8.class);
        singletonBean8.showMsg();
        Thread.sleep(3000);
        SingletonBean8 singletonBean81 = context.getBean(SingletonBean8.class);
        singletonBean81.showMsg();
        //output-8
        //current time from prototype bean : 2023-07-14T14:28:47.002474500
        //current time from prototype bean : 2023-07-14T14:28:50.011974300
    }
}
