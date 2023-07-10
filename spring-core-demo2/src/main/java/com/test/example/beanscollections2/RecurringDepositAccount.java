package com.test.example.beanscollections2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
//@Qualifier("advancedType")  //run-2
//@Order(2)  //run-3
public class RecurringDepositAccount implements Account, Ordered {

    @Override
    public String toString() {
        return "recurring deposit account";
    }

    @Override
    public int getOrder() {  //run-4
        return 2;
    }
}
