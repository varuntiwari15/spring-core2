package evnprofiles.env3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.ConfigurableEnvironment;

@Configuration
@PropertySource("test123.properties")   // or @PropertySource("classpath:test123.properties")
public class AddCustomPropertyFile {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AddCustomPropertyFile.class);
        ConfigurableEnvironment environment = context.getEnvironment();
        System.out.println("city : "+environment.getProperty("city"));
        System.out.println("state : "+environment.getProperty("state"));
        //output
        //city : Frisco
        //state : Texas
    }
}
