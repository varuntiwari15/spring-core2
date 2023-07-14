package com.test.example.shortlivescopeinlonglivescope;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class SingletonBean3 implements ApplicationContextAware {  //run-3

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
            this.applicationContext = applicationContext;
    }

    public void showMessage(){
        PrototypeBean3 prototypeBean3 = applicationContext.getBean(PrototypeBean3.class);
        System.out.println("current time from prototype bean : "+ prototypeBean3.getDateTime());
    }
}
