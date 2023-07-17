package eventhandling.eh5;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Listener2 {
    @EventListener
    public void listener2(Event2 event2){
        System.out.println("event msg received finally : "+ event2.getMsg2());
    }
}
