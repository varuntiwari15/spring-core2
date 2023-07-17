package internationalization.inter1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Locale;

public class TestClient {
    public static void main(String[] args) {
        //Locale.setDefault(Locale.US);
        Locale.setDefault(Locale.FRANCE);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        TestBean testBean = context.getBean(TestBean.class);
        testBean.printData();
        //output
        //user done this study for today, and he got 4 marks.
        // for french locale
        //just dummy text study to test, validate that 4 working.

    }
}
