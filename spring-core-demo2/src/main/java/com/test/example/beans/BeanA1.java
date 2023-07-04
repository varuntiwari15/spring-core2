package com.test.example.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
// using spring interface -- life cycle methods
@Component
public class BeanA1 implements InitializingBean, DisposableBean {

    public BeanA1() {
        System.out.println("BeanA1 constructor");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("BeanA1 destroy method for spring interface");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("BeanA1 afterPropertiesSet method for spring interface");
    }
}
