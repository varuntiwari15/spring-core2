package internationalization.inter2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class TestBean {
    @Autowired
    private MessageSource messageSource;

    public void testMessaging() throws InterruptedException {
        for(int i=0; i<20; i++){
            System.out.println(messageSource.getMessage("user.marks", new Object[]{"12"}, Locale.getDefault()));
            Thread.sleep(1000);
        }
    }

}
