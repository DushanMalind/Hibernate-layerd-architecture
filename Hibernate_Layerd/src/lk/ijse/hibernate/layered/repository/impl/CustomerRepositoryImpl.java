package lk.ijse.hibernate.layered.repository.impl;



import lk.ijse.hibernate.layered.entity.Customer;
import lk.ijse.hibernate.layered.repository.CrudRepository;
import lk.ijse.hibernate.layered.repository.CustomerRepository;
import org.hibernate.Session;


public class CustomerRepositoryImpl implements CustomerRepository {



    private static CustomerRepositoryImpl customerRepository;

    private CustomerRepositoryImpl(){

    }

    public static CustomerRepositoryImpl getInstance(){
        return null==customerRepository ? customerRepository=new CustomerRepositoryImpl() :customerRepository;
    }

    private Session session;

    public  void setSession(Session session){
        this.session=session;
    }

    public Long save(Customer customer){
        return (Long) session.save(customer);

    }

    public void   update(Customer customer){
        session.update(customer);

    }
    public Customer get(Long id){
        return session.get(Customer.class, id);

    }

    public void delete(Customer customer) {
        session.delete(customer);
    }


    /*public List<Customer>getAllCustomers(){
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
    }*/

}

