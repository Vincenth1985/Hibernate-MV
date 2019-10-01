package model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
public class Offer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idOffer;
    private LocalDate dateOfferMade;

    @ManyToOne(cascade = CascadeType.ALL)
    private Client client;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Product> productList;

    public void cloneFrom(Offer offer) {
        this.client = offer.client;
        this.dateOfferMade = offer.dateOfferMade;
        this.idOffer = offer.idOffer;
        this.productList = offer.productList;
    }

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

    public LocalDate getDateOfferMade() {
        return dateOfferMade;
    }

    public void setDateOfferMade(LocalDate dateOfferMade) {
        this.dateOfferMade = dateOfferMade;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
