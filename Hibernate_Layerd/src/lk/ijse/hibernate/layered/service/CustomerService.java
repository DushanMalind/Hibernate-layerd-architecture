package lk.ijse.hibernate.layered.service;

import lk.ijse.hibernate.layered.entity.Customer;
import lk.ijse.hibernate.layered.util.SessionFactoryConfiguaration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CustomerService {

    private static CustomerService customerService;

    private final Session session;

    public static CustomerService getInstance(){
        return null==customerService ? customerService=new CustomerService() : customerService;
    }
    private CustomerService(){
        session= SessionFactoryConfiguaration.getInstance().getSession();
    }

    public Long saveCustomer(Customer customer){
        Transaction transaction = session.beginTransaction();

        try {
            Long id = (Long)session.save(customer);
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
}
