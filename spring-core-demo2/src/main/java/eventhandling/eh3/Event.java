package eventhandling.eh3;

import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

@Component
public class Event extends ApplicationEvent {
    private final String msg;
    public Event(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
