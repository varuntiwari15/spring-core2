package com.test.example.beanscollections2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//@Component("checking")   // it is ok with bean name but when we require muliple beans with same name
// then use Qualifier instead of bean name because bean name is only for one single bean
@Component
//@Qualifier("basicType")  // it is just like a tagging any bean with this name/tag //run-2
@Order(4)  //run-3
public class CheckingAccount implements Account{
    @Override
    public String toString() {
        return "checking account";
    }
}
