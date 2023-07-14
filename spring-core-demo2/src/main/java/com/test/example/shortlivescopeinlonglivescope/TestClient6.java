package com.test.example.shortlivescopeinlonglivescope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class TestClient6 {  //run-6
    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TestClient6.class);
        SingletonBean6 singletonBean6 = context.getBean(SingletonBean6.class);
        singletonBean6.showMessage();
        Thread.sleep(3000);
        SingletonBean6 singletonBean61 = context.getBean(SingletonBean6.class);
        singletonBean61.showMessage();
        //output-6
        //current time from prototype bean : 2023-07-14T13:56:08.947859
        //current time from prototype bean : 2023-07-14T13:56:11.961755100
    }
}
