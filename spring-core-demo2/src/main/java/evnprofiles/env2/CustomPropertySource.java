package evnprofiles.env2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.ResourcePropertySource;

import java.io.IOException;

public class CustomPropertySource {  // added custom properties to existing default properties
    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        ConfigurableEnvironment environment = context.getEnvironment();
        //ClassPathResource cpr = new ClassPathResource("app.properties");  //way-1
        Resource r = new ClassPathResource("app.properties");
        //ResourcePropertySource rps = new ResourcePropertySource(cpr);  // way-1
        ResourcePropertySource rps = new ResourcePropertySource(r);  // way-2
        environment.getPropertySources().addLast(rps);
        String firstname = environment.getProperty("user.firstname");
        String lastname = environment.getProperty("user.lastname");
        System.out.println("firstname : "+ firstname);
        System.out.println("lastname : "+ lastname);
        //output
        //firstname : Varun
        //lastname : Tiwari
    }
}
