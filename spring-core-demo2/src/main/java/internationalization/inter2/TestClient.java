package internationalization.inter2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestClient {
    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        TestBean testBean = context.getBean(TestBean.class);
        testBean.testMessaging();
    }
}
