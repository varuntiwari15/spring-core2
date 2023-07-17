package eventhandling.eh2;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class TestListenerBean implements ApplicationListener<ContextRefreshedEvent> {
    // for single event
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("refresh event received in"+ this.getClass().getSimpleName()+" : "+ event);
    }
}