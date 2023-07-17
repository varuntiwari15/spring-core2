package eventhandling.eh1;

import org.springframework.context.event.*;
import org.springframework.stereotype.Component;

@Component
public class TestListenerBean {

    @EventListener
    public void handleContextStarted(ContextStartedEvent event){
        System.out.println("context started event : "+ event);
    }

    @EventListener
    public void handleContextStopped(ContextStoppedEvent event){
        System.out.println("context stopped event : "+ event);
    }

    @EventListener
    public void handleContextRefreshed(ContextRefreshedEvent event){
        System.out.println("context refresh event : "+ event);
    }

    @EventListener
    public void handleContextClosed(ContextClosedEvent event){
        System.out.println("context closed event : "+ event);
    }
}
