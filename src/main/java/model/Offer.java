package model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Offer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idOffer;
    private Date dateOfferMade;


    @ManyToOne
    private Client client;


    @ManyToMany
    private List<Product> productList;


    public Integer getIdOffer() {
        return idOffer;
    }

    public void setIdOffer(Integer idOffer) {
        this.idOffer = idOffer;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Date getDateOfferMade() {
        return dateOfferMade;
    }

    public void setDateOfferMade(Date dateOfferMade) {
        this.dateOfferMade = dateOfferMade;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
