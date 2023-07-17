package eventhandling.eh2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "eventhandling.eh2")
public class TestClient {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(TestClient.class);
        context.refresh();
        context.stop();
        context.start();
        //output
        //refresh event received inTestListenerBean : org.springframework.context.event.ContextRefreshedEvent[source=org.springframework.context.annotation.AnnotationConfigApplicationContext@2077d4de, started on Mon Jul 17 15:18:41 CDT 2023]
        //refresh event received inTestListenerBean2 : org.springframework.context.event.ContextRefreshedEvent[source=org.springframework.context.annotation.AnnotationConfigApplicationContext@2077d4de, started on Mon Jul 17 15:18:41 CDT 2023]
        //refresh event received inTestListenerBean2 : org.springframework.context.event.ContextStoppedEvent[source=org.springframework.context.annotation.AnnotationConfigApplicationContext@2077d4de, started on Mon Jul 17 15:18:41 CDT 2023]
        //refresh event received inTestListenerBean2 : org.springframework.context.event.ContextStartedEvent

    }
}
