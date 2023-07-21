package propertyeditors.pe4;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "propertyeditors.pe4")
@PropertySource("classpath:app.properties")
public class AppConfig {
}
