package com.test.example.dependson2;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn("userNameBean")
public class UserAddress {

    public UserAddress() {
        System.out.println("UserAddress constructor loaded");
    }

    public void prineUserAddress(String address){
        System.out.println("user's address is : "+ address);
    }
}
