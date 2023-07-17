package eventhandling.eh4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestClient {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        EventPublisher eventPublisher = context.getBean(EventPublisher.class);
        eventPublisher.sendMessage("hello bro");
    }
}
