package evnprofiles.profile1;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Profile("local")
public class InMemoryOrderServiceImpl implements OrderService{
    @Override
    public void placeOrder(Customer customer, String orderDetails) {
        System.out.println("in-memory order service: order placed by "+ customer+" details : "+ orderDetails);
    }
}
