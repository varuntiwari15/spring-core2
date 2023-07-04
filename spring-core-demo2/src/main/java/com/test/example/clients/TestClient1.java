package com.test.example.clients;

import com.test.example.configs.AppConfig1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class TestClient1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig1.class);
        context.registerShutdownHook(); // used to call destroy methods
        //output
       // beanA constructor
       // BeanA Post construct method
       // BeanA1 constructor
       // BeanA1 afterPropertiesSet method for spring interface
       // BeanA2 constructor
       //                 myinit method for spring @Bean param initMethod
       // myDestroy method for spring @Bean param destroyMethod
       // BeanA1 destroy method for spring interface
       // BeanA Pre Destroy method


    }
}
