package evnprofiles.profile1;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class TestClient {
    public static void main(String[] args) {
        runApp("local");
        System.out.println("****************************");
        runApp("dev");
    }

    private static void runApp(String profile) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        ConfigurableEnvironment environment = context.getEnvironment();
        environment.setActiveProfiles(profile);
        context.register(AppConfig.class);
        context.refresh();
        OrderClient orderClient = context.getBean(OrderClient.class);
        orderClient.placeOrder("Varun", "Washing machine");
        //output
        //in-memory order service: order placed by Customer{name='in-memory customer with id : Varun'} details : Washing machine
        //****************************
        //jpa order service: order placed by Customer{name='jpa customer with id: Varun'} details : Washing machine
    }
}
