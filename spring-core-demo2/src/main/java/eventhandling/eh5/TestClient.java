package eventhandling.eh5;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestClient {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        EventPublisher eventPublisher = context.getBean(EventPublisher.class);
        eventPublisher.sendMsg("msg from event1");
    }
}
