package eventhandling.eh1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "eventhandling.eh1")
public class TestClient {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(TestClient.class);
        System.out.println("*******refresh context********");
        context.refresh();;
        System.out.println("*******stopping context***********");
        context.stop();
        System.out.println("*******starting context*******");
        context.start();
        System.out.println("*******closing context********");
        context.close();
    }
}
