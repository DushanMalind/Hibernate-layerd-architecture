package lk.ijse.hibernate.layered.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "item")
public class Item {

    @Id
    @Column(name = "item_code")
    private long code;
    @Column(name = "item_description")
    private String description;
    @Column(name = "item_Quantity")
    private int qty;
    @Column(name = "item_unitprice")
    private double unitPrice;

   /* @ManyToMany(mappedBy = "itemList")
    List<Orders>ordersList=new ArrayList<>();

    public List<Orders> getOrdersList() {
        return ordersList;
    }

    public void setOrdersList(List<Orders> ordersList) {
        this.ordersList = ordersList;
    }*/



    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "item")
    private List<OrderDeatils>orderDeatilsList=new ArrayList<>();


}
