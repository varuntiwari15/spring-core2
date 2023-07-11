package com.test.example.beanconditionalregistration;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Locale;

public class LocaleConditionUSA implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        return Locale.getDefault().equals(Locale.US);
    }
}
