package resourcehandling.rh2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "resourcehandling.rh2")
public class TestClient {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TestClient.class);
        //output
        //hello to spring core tuto,
        //currently we are discussing ResourceLoader
        //and Resource interface
    }
}
