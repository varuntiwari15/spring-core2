package com.test.example.shortlivescopeinlonglivescope;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.test.example.shortlivescopeinlonglivescope")
public class AppConfig1 {  //run-1
}
