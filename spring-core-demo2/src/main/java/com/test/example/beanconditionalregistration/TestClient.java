package com.test.example.beanconditionalregistration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Locale;

@Configuration
@ComponentScan("com.test.example.beanconditionalregistration")
public class TestClient {
    public static void main(String[] args) {
        runApp(Locale.US);
        System.out.println("******************");
        runApp(Locale.CANADA);
        //output-1
       // setting default locale for app : en_US
       //         CountryUSA
       //******************
       // setting default locale for app : en_CA
       //         CountryCanada
    }

    private static void runApp(Locale locale) {
        System.out.printf("setting default locale for app : %s\n", locale);
        Locale.setDefault(locale);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TestClient.class);
        TestBean testBean = context.getBean(TestBean.class);
        testBean.printCountryName();
    }
}
