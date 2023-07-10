package com.test.example.beanscollections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan(basePackages = "com.test.example.beanscollections")
public class AppConfig {

    @Bean
    public String[] arrayFruits(){
        return new String[]{"apple", "mango", "papaya"};
    }

    @Bean
    public List<String> listVegies(){
        return Arrays.asList("potato", "tomato", "pumpkin");
    }
}
