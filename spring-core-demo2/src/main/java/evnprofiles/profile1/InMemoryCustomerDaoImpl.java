package evnprofiles.profile1;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
@Profile("local")
public class InMemoryCustomerDaoImpl implements CustomerDao{
    @Override
    public Customer getCustomer(String id) {
        return new Customer("in-memory customer with id : "+ id);
    }
}
