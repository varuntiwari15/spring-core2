package com.test.example.shortlivescopeinlonglivescope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class TestClient4 {  //run-4
    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TestClient4.class);
        SingletonBean4 singletonBean4 = context.getBean(SingletonBean4.class);
        singletonBean4.showMessage();
        Thread.sleep(3000);
        SingletonBean4 singletonBean41 = context.getBean(SingletonBean4.class);
        singletonBean41.showMessage();
        // output-4
        //current time from prototype bean : 2023-07-14T13:37:56.469328400
        //current time from prototype bean : 2023-07-14T13:37:59.477189700
    }

}
