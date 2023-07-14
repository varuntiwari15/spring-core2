package com.test.example.shortlivescopeinlonglivescope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

@Configuration
@ComponentScan
public class TestClient9 {  //run-9

    @Bean
    public Function<String, PrototypeBean9> function(){
        return name -> new PrototypeBean9(name);
    }
    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TestClient9.class);
        SingletonBean9 singletonBean9 = context.getBean(SingletonBean9.class);
        singletonBean9.showMsg();
        Thread.sleep(3000);
        SingletonBean9 singletonBean91 = context.getBean(SingletonBean9.class);
        singletonBean91.showMsg();
        // output-9
        //current time from prototype bean: 2023-07-14T16:21:58.183089300
        //current time from prototype bean: 2023-07-14T16:22:01.190438
    }
}
