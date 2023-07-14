package com.test.example.shortlivescopeinlonglivescope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestClient1 {  // run-1
    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig1.class);
        SingletonBean1 singletonBean1 = context.getBean(SingletonBean1.class);
        singletonBean1.showMessage();
        Thread.sleep(1000);
        SingletonBean1 singletonBean2 = context.getBean(SingletonBean1.class);
        singletonBean2.showMessage();
        // output-1
       // current time from prototype bean is : 2023-07-14T11:06:47.790861500
       // current time from prototype bean is : 2023-07-14T11:06:47.790861500
        // both output same as singleton bean initiated only once so autowired prototype bean
        // also initiated only once so it showing same output as same object
    }
}
