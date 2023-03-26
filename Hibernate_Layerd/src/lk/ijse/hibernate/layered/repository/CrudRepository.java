package lk.ijse.hibernate.layered.repository;

import lk.ijse.hibernate.layered.entity.Customer;

import java.util.ArrayList;
import java.util.List;

public interface CrudRepository <T,ID> extends SuperRepository{

    List<T> getAll();

    ID save(T object);

    void  update(T object);

    T get(ID id);

    void delete(T object);

}
