package lk.ijse.hibernate.layered.service;

import lk.ijse.hibernate.layered.dto.CustomerDTO;
import lk.ijse.hibernate.layered.entity.Customer;
import lk.ijse.hibernate.layered.projection.CustomerDetailDto;

import java.util.List;

public interface CustomerService  {

    List<CustomerDTO> getAllCustomer();

    List<CustomerDTO> getAllJPQLCustomers();

    List<CustomerDetailDto> getAllCustomerProjection();

    Long saveCustomer(Customer customer);

    Customer getCustomer(long id);

    boolean updateCustomer(Customer customer);

    boolean deleteCustomer(Customer customer);
}
