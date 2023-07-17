package internationalization.inter1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class TestBean {

    @Autowired
    private MessageSource messageSource;

    public void printData(){
        System.out.println(messageSource.getMessage("user.activity",
                new Object[]{"study", 4},
                Locale.getDefault()));
    }

}
