package eventhandling.eh4;

import org.springframework.stereotype.Component;

@Component
public class Event {
    private String message;

    public Event(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
