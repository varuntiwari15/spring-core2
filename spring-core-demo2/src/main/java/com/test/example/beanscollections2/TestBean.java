package com.test.example.beanscollections2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@Component
public class TestBean {

    @Autowired
    //@Qualifier("basicType") //run-2
    private Account[] account;

  //  @Autowired
   // @Qualifier("advancedType")  //run-2
 //   private Account[] account2;

    @PostConstruct
    public void init(){
        System.out.println("*********basic account types**************");
        System.out.println(Arrays.toString(account));
    //    System.out.println("*********advanced account types**************");  //run-2
    //    System.out.println(Arrays.toString(account2));   //run-2
    }
}
