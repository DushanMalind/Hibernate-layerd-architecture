package lk.ijse.hibernate.layered.service;

import lk.ijse.hibernate.layered.entity.Customer;

public interface CustomerService  {
    Long saveCustomer(Customer customer);

    Customer getCustomer(long id);

    boolean updateCustomer(Customer customer);

    boolean deleteCustomer(Customer customer);
}
