package lk.ijse.hibernate.layered;


import lk.ijse.hibernate.layered.entity.Customer;
import lk.ijse.hibernate.layered.service.CustomerServiceImpl;

public class Appliniler {
    public static void main(String[] args) {


        CustomerServiceImpl customerService = CustomerServiceImpl
                .getInstance();
        Customer customer = getCustomerEntity();

        customerService.saveCustomer(customer);

        Customer existingCustomer = customerService.getCustomer(1L);
        existingCustomer.setAddress("Matara");

        customerService.updateCustomer(existingCustomer);

       /* customerService.deleteCustomer(customer);*/

       /* List<Customer> customers = customerService.getAllCustomers();
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
*/
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
