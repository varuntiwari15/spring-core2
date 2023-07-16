package evnprofiles.env4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestClient {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        //output
        //college name : college-ABC
        //Dept name : Physics dept
        //Student year : 2nd year

    }
}
