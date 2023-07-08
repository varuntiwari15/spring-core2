package com.test.example.dependson2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestClient {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
     //   UserAddress userAddress = context.getBean(UserAddress.class);
     //   UserName userName = context.getBean(UserName.class);
     //   userAddress.prineUserAddress("Noida, India");
     //   userName.printName("Varun Tiwari");
        // now lets first load userName bean then userAddress bean and both are not in any relation
        // like constrcutor or field
        // so use dependsOn with userAddress means userAdress bean will be loaded after
        //loading of username bean means first user will be there then his address will be there


    }
}
