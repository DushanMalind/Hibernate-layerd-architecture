package lk.ijse.hibernate.layered;


import lk.ijse.hibernate.layered.entity.Customer;
import lk.ijse.hibernate.layered.projection.CustomerDetailDto;
import lk.ijse.hibernate.layered.repository.CustomerRepository;
import lk.ijse.hibernate.layered.util.SessionFactoryConfiguaration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Appliniler {
    public static void main(String[] args) {


        Session session = SessionFactoryConfiguaration.getInstance().getSession();
        Transaction transaction= session.beginTransaction();



        CustomerRepository customerRepository=new CustomerRepository();
        Customer customer=getCustomerEntity();

        customerRepository.saveCustomer(customer);

        customerRepository = new CustomerRepository();
        List<Customer> customers = customerRepository.getAllCustomers();
        for (Customer customer1 : customers) {
            System.out.println(customer1);
        }

        customerRepository = new CustomerRepository();
        List<Customer> jpqlCustomers = customerRepository.getAllJPQLCustomers();
        for (Customer customer1 : jpqlCustomers) {
            System.out.println(customer1);
        }

        // Now this Projection works. Please refer the CustomerRepository
        customerRepository = new CustomerRepository();
        List<CustomerDetailDto> jpqlCustomerProj = customerRepository.getAllCustomerProjection();
        for (CustomerDetailDto customer1 : jpqlCustomerProj) {
            System.out.println(customer1);
        }

    }
    private static Customer getCustomerEntity() {
        Customer customer = new Customer();
        // Sets Customer table's primary key
        customer.setId(1L);

        // Defines the NameIdentifier - Embeddable object data


        // Sets the NameIdentifier object data as Name in Customer Entity
//        customer.setName(nameIdentifier);

        // Sets the customer address
        customer.setAddress("Galle");
        // Sets the customer salary
//        customer.setSalary(30000.00);
        // Sets the customer age
        customer.setAge(22);





        return customer;
    }
}