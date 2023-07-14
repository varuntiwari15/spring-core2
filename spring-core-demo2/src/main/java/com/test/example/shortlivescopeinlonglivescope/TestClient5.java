package com.test.example.shortlivescopeinlonglivescope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class TestClient5 {  //run-5
    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TestClient5.class);
        SingletonBean5 singletonBean5 = context.getBean(SingletonBean5.class);
        singletonBean5.showMessage();
        Thread.sleep(3000);
        SingletonBean5 singletonBean51 = context.getBean(SingletonBean5.class);
        singletonBean51.showMessage();
        // output-5
        //current time from prototype bean : 2023-07-14T13:46:12.671730600
        //current time from prototype bean : 2023-07-14T13:46:15.705978700
    }
}
