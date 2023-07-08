package com.test.example.event;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

public class EventListener {  // class listen each event in order
    @Autowired
    private EventManager eventManager;

    @PostConstruct
    private void initialize(){
        System.out.println("initializing: "+this.getClass().getSimpleName());
        eventManager.addListener(e -> System.out.println("event received in event listener bean"));
    }
}
