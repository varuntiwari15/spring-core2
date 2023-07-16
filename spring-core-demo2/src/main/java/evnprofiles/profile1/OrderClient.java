package evnprofiles.profile1;

import org.springframework.stereotype.Component;

@Component
public class OrderClient {
    private CustomerDao customerDao;
    private OrderService orderService;

    public OrderClient(CustomerDao customerDao, OrderService orderService) {
        this.customerDao = customerDao;
        this.orderService = orderService;
    }

    public void placeOrder(String customerId, String order){
        Customer customer = customerDao.getCustomer(customerId);
        orderService.placeOrder(customer, order);
    }
}
