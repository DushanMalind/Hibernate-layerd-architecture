package lk.ijse.hibernate.layered.entity;


import javax.persistence.*;

@Entity
@Table(name = "order_details")
public class OrderDeatils  {
   /* @Id
    @Column(name = "orderDeatils_id")
    private long id;*/
    @EmbeddedId
    private OrderDeatilsPK orderDeatilsPK;
    @Column(name = "order_price")
    private double price;
    @Column(name = "order_qty")
    private int qty;



    @ManyToOne
    @JoinColumn(name = "order_id",referencedColumnName = "order_id",insertable = false,updatable = false)

    private Orders orders;




    @ManyToOne
    @JoinColumn(name = "item_code",referencedColumnName = "item_code",insertable = false,updatable = false)
    private Item item;





}
