package com.test.example.dependson2;

import org.springframework.stereotype.Component;

@Component("userNameBean")
public class UserName {

    public UserName() {
        System.out.println("userName constructor loaded");
    }

    public void printName(String name){
        System.out.println("user's name is :  "+ name);
    }
}
