package com.test.example.event;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class EventManager {  // class manage both event publish and event listen
    private final List<Consumer<String>> listeners = new ArrayList<>();
    @PostConstruct
    private void initialize(){
        System.out.println("initializing: "+this.getClass().getSimpleName());
    }

    public void publish(final String message){
        listeners.forEach(m -> m.accept(message));
    }

    public void addListener(Consumer<String> eventConsumer) {
        listeners.add(eventConsumer);
    }

}
