package eventhandling.eh4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class EventPublisher {
    @Autowired
    private ApplicationEventPublisher publisher;

    public void sendMessage(String msg){
        publisher.publishEvent(new Event(msg));
    }
}
