package internationalization.inter2;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@Configuration
@ComponentScan(basePackages = "internationalization.inter2")
public class AppConfig {

    @Bean
    public MessageSource messageSource(){
        ReloadableResourceBundleMessageSource ms = new ReloadableResourceBundleMessageSource();
        ms.setBasename("messages/test");
        //ms.setBasenames("messages/test1", "messages/test2"); //multiple message sources
        ms.setDefaultEncoding("UTF-8");
        ms.setCacheMillis(1000); // refresh cache every 1 sec
        return ms;
    }
}
