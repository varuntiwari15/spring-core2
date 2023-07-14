package com.test.example.shortlivescopeinlonglivescope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestClient3 {  //run-3
    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig3.class);
        SingletonBean3 singletonBean3 = context.getBean(SingletonBean3.class);
        singletonBean3.showMessage();
        Thread.sleep(3000);
        SingletonBean3 singletonBean31 = context.getBean(SingletonBean3.class);
        singletonBean31.showMessage();
        //output-3
        //current time from prototype bean : 2023-07-14T13:10:49.479970600
        //current time from prototype bean : 2023-07-14T13:10:52.485138100

    }
}
