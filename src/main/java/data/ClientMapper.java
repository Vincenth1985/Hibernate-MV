package data;

import connection.EntityManagerFactoryProvider;
import model.Client;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class ClientMapper {

    public Client createClient(Client client) {
        EntityManager em = EntityManagerFactoryProvider.getEM();
        EntityTransaction transaction = em.getTransaction();

        transaction.begin();
        em.persist(client);
        transaction.commit();

        em.close();
        return client;
    }

    public Client getClient(Integer id) {
        EntityManager em = EntityManagerFactoryProvider.getEM();
        Client toReturn = em.find(Client.class, id);

        em.close();
        return toReturn;
    }

    public Client deleteClient(Client client) {
        EntityManager em = EntityManagerFactoryProvider.getEM();
        EntityTransaction transaction = em.getTransaction();

        transaction.begin();
        client = em.find(Client.class, client.getClientId());
        em.remove(client);
        transaction.commit();

        em.close();
        return client;
    }

    public Client updateClient(Client client) {
        EntityManager em = EntityManagerFactoryProvider.getEM();
        EntityTransaction transaction = em.getTransaction();

        transaction.begin();
        Client dbClient = em.find(Client.class, client.getClientId());
        dbClient.cloneFrom(client);
        transaction.commit();

        em.close();
        return dbClient;
    }
}
