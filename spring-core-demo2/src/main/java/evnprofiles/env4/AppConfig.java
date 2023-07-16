package evnprofiles.env4;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "evnprofiles.env4")
@PropertySource("test666.properties")
public class AppConfig {
}
