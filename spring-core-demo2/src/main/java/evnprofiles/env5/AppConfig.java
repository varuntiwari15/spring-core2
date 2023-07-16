package evnprofiles.env5;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "evnprofiles.env5")
@PropertySource("test222.properties")
public class AppConfig {
}
