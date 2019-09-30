package model;


import javax.persistence.*;
import java.util.Date;

@Entity
public class Order {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;
    private Date transformationDate;


    @OneToOne
    private Offer offer;


    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Date getTransformationDate() {
        return transformationDate;
    }

    public void setTransformationDate(Date transformationDate) {
        this.transformationDate = transformationDate;
    }

    public Offer getOffer() {
        return offer;
    }

    public void setOffer(Offer offer) {
        this.offer = offer;
    }
}
