package lk.ijse.hibernate.layered.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class OrderDeatilsPK implements Serializable {
    @Column(name = "order_Id")
    private long orderId;

    @Column(name = "item_code")
    private long itemId;
}
