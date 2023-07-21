package propertyeditors.pe5;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "propertyeditors.pe5")
@PropertySource("classpath:app.properties")
public class AppConfig {

    @Bean
    public static CustomEditorConfigurer configurer(){
        CustomEditorConfigurer customEditorConfigurer = new CustomEditorConfigurer();
        //customEditorConfigurer.setCustomEditors(new MyCustomEditor());
        customEditorConfigurer.setPropertyEditorRegistrars(new PropertyEditorRegistrar[]{new MyCustomEditor()});
        return customEditorConfigurer;
    }
}
