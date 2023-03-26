package lk.ijse.hibernate.layered.service;

import lk.ijse.hibernate.layered.entity.Customer;
import lk.ijse.hibernate.layered.repository.CustomerRepository;
import lk.ijse.hibernate.layered.repository.impl.CustomerRepositoryImpl;
import lk.ijse.hibernate.layered.util.SessionFactoryConfiguaration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    private static CustomerServiceImpl customerService;

    private  Session session;

    //interface true call kirima
    private final CustomerRepository customerRepository;

    public static CustomerServiceImpl getInstance(){
        return null==customerService ? customerService=new CustomerServiceImpl() : customerService;
    }
    private CustomerServiceImpl(){
        session= SessionFactoryConfiguaration.getInstance().getSession();

        customerRepository= CustomerRepositoryImpl.getInstance();
    }


    @Override
    public List<Customer> getAllCustomer() {
        session = SessionFactoryConfiguaration.getInstance()
                .getSession();
        customerRepository.setSession(session);
        ArrayList<Customer>customerArrayList= (ArrayList<Customer>) customerRepository.getAll();
        return customerArrayList;
    }

    public Long saveCustomer(Customer customer){
        Transaction transaction = session.beginTransaction();

        try {
            customerRepository.setSession(session);
            Long id = (Long) customerRepository.save(customer);
            transaction.commit();
            session.close();
            return id;
        }catch (Exception e){
            transaction.rollback();
            session.close();
            e.printStackTrace();
            return -1L;
        }

    }

    public Customer getCustomer(long id){
        try {
            session = SessionFactoryConfiguaration.getInstance()
                    .getSession();
            customerRepository.setSession(session);
            Customer customer = customerRepository.get(id);
            session.close(); // We've closed the unclosed sessions in previous week's code
            return customer;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
    }

    public boolean updateCustomer(Customer customer) {
        session = SessionFactoryConfiguaration.getInstance()
                .getSession();
        Transaction transaction = session.beginTransaction();
        try {
            customerRepository.setSession(session);
            customerRepository.update(customer);
            transaction.commit();
            session.close();
            return true;
        } catch (Exception ex) {
            transaction.rollback();
            session.close();
            ex.printStackTrace();
            return false;
        }
    }

    public boolean deleteCustomer(Customer customer) {
        session = SessionFactoryConfiguaration.getInstance()
                .getSession();
        Transaction transaction = session.beginTransaction();
        try {
            customerRepository.setSession(session);
            customerRepository.delete(customer);
            transaction.commit();
            session.close(); // We've closed the unclosed sessions in previous week's code
            return true;
        } catch (Exception ex) {
            transaction.rollback();
            ex.printStackTrace();
            session.close(); // We've closed the unclosed sessions in previous week's code
            return false;
        }
    }


}
