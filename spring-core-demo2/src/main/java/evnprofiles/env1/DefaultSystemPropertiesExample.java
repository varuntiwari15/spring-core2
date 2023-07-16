package evnprofiles.env1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Map;

public class DefaultSystemPropertiesExample {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        ConfigurableEnvironment environment = context.getEnvironment();
        Map<String, Object> systemProperties = environment.getSystemProperties();
        systemProperties.entrySet().forEach(e -> System.out.println(e));
        System.out.println("****************");
        Map<String, Object> systemEnvironment = environment.getSystemEnvironment();
        systemEnvironment.entrySet().forEach(e -> System.out.println(e));

    }
}
