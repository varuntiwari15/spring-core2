package evnprofiles.profile1;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
@Profile("dev")
public class JpaCustomerDaoImpl implements CustomerDao{
    @Override
    public Customer getCustomer(String id) {
        return new Customer("jpa customer with id: "+ id);
    }
}
