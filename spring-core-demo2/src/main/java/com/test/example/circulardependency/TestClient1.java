package com.test.example.circulardependency;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.test.example.circulardependency")
public class TestClient1 {
   // public static void main(String[] args) {
    //    new AnnotationConfigApplicationContext(TestClient1.class);
        //output-1
        //Caused by: org.springframework.beans.factory.BeanCurrentlyInCreationException:
        // to fix this in spring 2 methods- using setter injection and using Lazy initialization
   // }
   public static void main(String[] args) { //run-2
      new AnnotationConfigApplicationContext(AppConfig.class);
      // output-2
      //driven by: com.test.example.circulardependency.Driver1@36ebc363
      //my car: com.test.example.circulardependency.Car1@45752059
      // also to fix this we can use Lazy // run-3
      // need to use @Lazy with only one bean either with Car1 or Driver1 constructor
      //output-3 same as output-2


   }
}
