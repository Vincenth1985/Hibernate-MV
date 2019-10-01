package data;

import connection.EntityManagerFactoryProvider;
import model.Offer;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class OfferMapper {
    public Offer createOffer(Offer offer) {
        EntityManager em = EntityManagerFactoryProvider.getEM();
        EntityTransaction transaction = em.getTransaction();

        transaction.begin();
        em.persist(offer);
        transaction.commit();

        em.close();
        return offer;
    }

    public Offer getOffer(Integer id) {
        EntityManager em = EntityManagerFactoryProvider.getEM();
        Offer toReturn = em.find(Offer.class, id);

        em.close();
        return toReturn;
    }

    public Offer deleteOffer(Offer offer) {
        EntityManager em = EntityManagerFactoryProvider.getEM();
        EntityTransaction transaction = em.getTransaction();

        transaction.begin();
        Offer dbOffer = em.find(Offer.class, offer.getIdOffer());
        em.remove(dbOffer);
        transaction.commit();

        em.close();
        return dbOffer;
    }

    public Offer updateOffer(Offer offer) {
        EntityManager em = EntityManagerFactoryProvider.getEM();
        EntityTransaction transaction = em.getTransaction();

        transaction.begin();
        Offer dbOffer = em.find(Offer.class, offer.getIdOffer());
        dbOffer.cloneFrom(offer);
        transaction.commit();

        em.close();
        return dbOffer;
    }
}
