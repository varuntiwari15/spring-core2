package com.test.example.beanscollections2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
//@Qualifier("advancedType")  //run-2
@Order(3)  //run-3
public class FixedDepositAccount implements Account{

    @Override
    public String toString() {
        return "fixed deposit account";
    }
}
