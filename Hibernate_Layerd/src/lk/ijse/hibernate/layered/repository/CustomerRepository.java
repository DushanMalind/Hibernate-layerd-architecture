package lk.ijse.hibernate.layered.repository;

import lk.ijse.hibernate.layered.entity.Customer;
import org.hibernate.Session;

public interface CustomerRepository extends CrudRepository<Customer,Long>{
    void setSession(Session session);
}
