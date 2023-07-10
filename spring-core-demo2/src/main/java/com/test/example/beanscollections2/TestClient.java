package com.test.example.beanscollections2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestClient {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        //output1
        //[checking account, fixed deposit account, recurring deposit account, saving account]
        // now lets we want only checking account, use Qualifier - see comments with run-2
        // also we can divide account types in different categories as basicType and advancedType - run-2
        //output-2
        //*********basic account types**************
        //[checking account, saving account]
        //*********advanced account types**************
        //[fixed deposit account, recurring deposit account]
        // output1 is unordered output because in which order container will manage bean creation, we dont know
        // lets we want some ordering as --> saving, reccuring, fixed, checking--> use @Order --run-3
        // or Ordered interface-- run-4
        //output-3
        //*********basic account types**************
        //[saving account, recurring deposit account, fixed deposit account, checking account]
        // for ordered interface same output as 3


    }
}
