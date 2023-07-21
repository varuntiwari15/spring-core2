package propertyeditors.pe5;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestClient {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        TestBean testBean = context.getBean(TestBean.class);
        testBean.showDetails();
    }
}
