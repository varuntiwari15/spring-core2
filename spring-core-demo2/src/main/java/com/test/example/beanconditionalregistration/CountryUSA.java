package com.test.example.beanconditionalregistration;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Component
@Conditional(LocaleConditionUSA.class)
public class CountryUSA implements Country{
    @Override
    public String toString() {
        return "USA";
    }
}
