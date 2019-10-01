package data;

import connection.EntityManagerFactoryProvider;
import model.Offer;
import model.Order;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class OrderMapper {


    public Order confirmOrder(Offer offer) {
        EntityManager em = EntityManagerFactoryProvider.getEM();
        Order order = new Order();
        order.setOffer(offer);

        em.getTransaction().begin();
        em.persist(order);
        em.getTransaction().commit();
        em.close();

        return order;
    }

    public Order createOrder(Order order) {
        EntityManager em = EntityManagerFactoryProvider.getEM();
        EntityTransaction transaction = em.getTransaction();

        transaction.begin();
        em.persist(order);
        transaction.commit();

        em.close();
        return order;
    }

    public Order getOrder(Integer id) {
        EntityManager em = EntityManagerFactoryProvider.getEM();
        EntityTransaction transaction = em.getTransaction();

        transaction.begin();
        Order order = em.find(Order.class, getOrder(id));
        transaction.commit();

        em.close();
        return order;
    }

    public Order deleteOrder(Order order) {
        EntityManager em = EntityManagerFactoryProvider.getEM();
        EntityTransaction transaction = em.getTransaction();

        transaction.begin();
        order = em.find(Order.class, order.getOrderId());
        em.remove(order);
        transaction.commit();

        em.close();
        return order;
    }

    public Order updateOrder(Order order) {
        EntityManager em = EntityManagerFactoryProvider.getEM();
        EntityTransaction transaction = em.getTransaction();

        transaction.begin();
        Order dbOrder = em.find(Order.class, order.getOrderId());
        dbOrder.clone(order);
        transaction.commit();

        em.close();

        return dbOrder;
    }


}
