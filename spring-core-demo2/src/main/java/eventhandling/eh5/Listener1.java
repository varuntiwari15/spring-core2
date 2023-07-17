package eventhandling.eh5;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Listener1 {
    @EventListener
    public Event2 listener1(Event1 event1){
        return new Event2(event1.getMsg1());
    }
}
