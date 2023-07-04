package com.test.example.configs;

import com.test.example.beans.BeanA2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.test.example.beans")
public class AppConfig1 {
    @Bean(initMethod = "myInit", destroyMethod = "myDestroy")
    public BeanA2 beanA2(){
        return new BeanA2();
    }
}
