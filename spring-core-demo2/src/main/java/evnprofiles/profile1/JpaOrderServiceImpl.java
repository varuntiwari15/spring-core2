package evnprofiles.profile1;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dev")
public class JpaOrderServiceImpl implements OrderService{
    @Override
    public void placeOrder(Customer customer, String orderDetails) {
        System.out.println("jpa order service: order placed by "+ customer+" details : "+ orderDetails);
    }
}
