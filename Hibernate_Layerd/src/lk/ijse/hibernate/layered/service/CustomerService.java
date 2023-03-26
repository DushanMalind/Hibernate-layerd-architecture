package lk.ijse.hibernate.layered.service;

import lk.ijse.hibernate.layered.entity.Customer;

import java.util.List;

public interface CustomerService  {

    List<Customer> getAllCustomer();

    Long saveCustomer(Customer customer);

    Customer getCustomer(long id);

    boolean updateCustomer(Customer customer);

    boolean deleteCustomer(Customer customer);
}
