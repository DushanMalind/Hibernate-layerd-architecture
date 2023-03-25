package lk.ijse.hibernate.layered.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "orders")
public class Orders {
    @Id
    @Column(name = "order_id")
    private long id;
    @Column(name = "order_date")
    private Timestamp orderDate;



    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer1;




/////////////

   /* @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Item>itemList=new ArrayList<>();

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }*/



    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "orders")
    private List<OrderDeatils>orderDeatilsList=new ArrayList<>();


    public Orders() {
    }

    public Orders(long id, Timestamp orderDate, Customer customer1) {
        this.id = id;
        this.orderDate = orderDate;
        this.customer1 = customer1;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Timestamp getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Timestamp orderDate) {
        this.orderDate = orderDate;
    }

    public Customer getCustomer1() {
        return customer1;
    }

    public void setCustomer1(Customer customer1) {
        this.customer1 = customer1;
    }
}
