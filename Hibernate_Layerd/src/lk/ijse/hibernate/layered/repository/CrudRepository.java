package lk.ijse.hibernate.layered.repository;

import lk.ijse.hibernate.layered.entity.Customer;

public interface CrudRepository <T,ID>{

    ID save(T object);

    void  update(T object);

    T get(ID id);

    void delete(T object);

}
