package lk.ijse.hibernate.layered.util;


import lk.ijse.hibernate.layered.entity.Customer;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.IOException;
import java.util.Properties;

public class SessionFactoryConfiguaration {

    private static SessionFactoryConfiguaration factoryConfiguaration;
    private final SessionFactory sessionFactory;

    private SessionFactoryConfiguaration() {


        sessionFactory = new Configuration().mergeProperties(Utility.getProperties())
                .addAnnotatedClass(Customer.class)
                .buildSessionFactory();


    }



    public static SessionFactoryConfiguaration getInstance() {
        return (null == factoryConfiguaration) ? factoryConfiguaration = new SessionFactoryConfiguaration() : factoryConfiguaration;
    }

    public Session getSession() throws HibernateException {

        return sessionFactory.openSession();
    }
}

