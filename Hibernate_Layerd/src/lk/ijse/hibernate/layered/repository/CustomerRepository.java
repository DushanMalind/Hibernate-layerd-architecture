package lk.ijse.hibernate.layered.repository;



import lk.ijse.hibernate.layered.entity.Customer;
import lk.ijse.hibernate.layered.projection.CustomerDetailDto;
import lk.ijse.hibernate.layered.util.SessionFactoryConfiguaration;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;


public class CustomerRepository {

    private final Session session;

    public CustomerRepository(){
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

    /*public boolean  updateCustomer(Customer customer){
        Transaction transaction = session.beginTransaction();

        try {
            session.update(customer);
            transaction.commit();
            session.close();
            return true;
        }catch (Exception e){
            transaction.rollback();
            session.close();
            e.printStackTrace();
            return false;
        }

    }

    public Customer getCustomer(long id){
        try {

            return session.get(Customer.class,id);





Customer customer=session.get(Customer.class,id);
            return customer;





        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }

    }

    public boolean delteCustomer(Customer customer){
        Transaction transaction = session.beginTransaction();
        try {
            session.delete(customer);
            transaction.commit();
            return true;
        }catch (Exception e){
            transaction.rollback();
            e.printStackTrace();
            return false;
        }
*/
    public List<Customer>getAllCustomers(){
        String sqlQuery="FROM Customer";
        Query query=session.createQuery(sqlQuery);
        List list= query.list();
        session.close();
        return list;
    }

    public List<Customer>getAllJPQLCustomers(){
        String sql="SELECT C FROM Customer AS C";
        Query query= session.createQuery(sql);
        List list=query.list();
        session.close();
        return list;
    }

    //constructor projection JPQL
    public List<CustomerDetailDto>getAllCustomerProjection(){
        String sql="SELECT new lk.ijse.hibernate.layered.projection.CustomerDetailDto(C.name, C.address, C.age) FROM Customer AS C";
        Query query= session.createQuery(sql);
        List list=query.list();
        return list;
    }

}

