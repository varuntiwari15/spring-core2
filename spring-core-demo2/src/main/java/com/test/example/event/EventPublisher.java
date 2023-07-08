package com.test.example.event;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

public class EventPublisher {  // class for event publish
    @Autowired
    private EventManager eventManager;

    @PostConstruct
    private void initialize(){
        System.out.println("initializing: "+this.getClass().getSimpleName());
        eventManager.publish("event publish: What is your name?");
    }

    public String publish(String msg){
        //TODO
        return null;
    }
}
