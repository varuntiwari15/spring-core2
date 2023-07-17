package eventhandling.eh5;

import org.springframework.stereotype.Component;

@Component
public class Event2 {
    private final String msg2;

    public Event2(String msg2) {
        this.msg2 = msg2;
    }

    public String getMsg2() {
        return msg2;
    }
}
