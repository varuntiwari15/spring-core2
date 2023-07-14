package com.test.example.shortlivescopeinlonglivescope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestClient2 {  //run-2
    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig2.class);
        SingletonBean2 singletonBean2 = context.getBean(SingletonBean2.class);
        singletonBean2.showMessage();
        Thread.sleep(2000);
        SingletonBean2 singletonBean21 = context.getBean(SingletonBean2.class);
        singletonBean21.showMessage();
        // output-2
        //current time from prototype bean : 2023-07-14T12:13:28.891551
        //current time from prototype bean : 2023-07-14T12:13:30.892359400

    }
}
