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
