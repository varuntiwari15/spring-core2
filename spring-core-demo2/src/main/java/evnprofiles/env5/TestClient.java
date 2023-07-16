package evnprofiles.env5;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestClient {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        BookBean bookBean = context.getBean(BookBean.class);
        bookBean.printdetails();
        //output
        //Book name : spring-book , Book price : 12 , Book country :  India
    }
}
