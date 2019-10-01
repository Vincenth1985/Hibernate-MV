package model;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Orders_")
public class Order {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;
    private LocalDate transformationDate;


    @OneToOne(cascade = CascadeType.ALL)
    private Offer offer;


    public void clone(Order order) {
        this.orderId = order.getOrderId();
        this.transformationDate = order.getTransformationDate();
        this.offer = order.getOffer();
    }


    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public LocalDate getTransformationDate() {
        return transformationDate;
    }

    public void setTransformationDate(LocalDate transformationDate) {
        this.transformationDate = transformationDate;
    }

    public Offer getOffer() {
        return offer;
    }

    public void setOffer(Offer offer) {
        this.offer = offer;
    }


}
