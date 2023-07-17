package eventhandling.eh4;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Listener {
    @EventListener
    public void listen(Event event){
        System.out.println("event msg received : "+ event.getMessage());
    }
}
