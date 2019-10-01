package data;

import connection.EntityManagerFactoryProvider;
import model.Offer;
import model.Order;

import javax.persistence.EntityManager;

public class OrderMapper {


    public Order confirmOrder(Offer offer) {
        EntityManager em = EntityManagerFactoryProvider.getEM();
        Order order = new Order();
        order.setOffer(offer);
        em.persist(order);
        em.getTransaction().begin();
        em.getTransaction().commit();
        em.close();

        return order;
    }

    public Order createOrder(Order order) {
        return null;
    }

    public Order getOrder(Integer id) {
        return null;
    }

    public Order deleteOrder(Order order) {
        return null;
    }

    public Order updateOrder(Order order) {
        return null;
    }


}
