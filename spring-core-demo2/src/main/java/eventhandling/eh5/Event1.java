package eventhandling.eh5;

import org.springframework.stereotype.Component;

@Component
public class Event1 {

    private final String msg1;

    public Event1(String msg1) {
        this.msg1 = msg1;
    }

    public String getMsg1() {
        return msg1;
    }
}
