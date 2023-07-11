package com.test.example.beanconditionalregistration;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Component
@Conditional(LocaleConditionCanada.class)
public class CountryCanada implements Country{
    @Override
    public String toString() {
        return "CANADA";
    }
}
