package com.test.example.beanscollections2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
//@Qualifier("basicType")  //run-2
@Order(1)  //run-3
public class SavingAccount implements Account{

    @Override
    public String toString() {
        return "saving account";
    }
}
