package com.test.example.beanscollections;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestClient {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

    }
}
