package eventhandling.eh3;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class Listener implements ApplicationListener<Event> {

    @Override
    public void onApplicationEvent(Event event) {
        System.out.println("event received : "+ event.getMsg());
        System.out.println("event source : "+ event.getSource());
    }
}
