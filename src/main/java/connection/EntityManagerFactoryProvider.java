package connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactoryProvider {

    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("?");
    EntityManager entityManager = entityManagerFactory.createEntityManager();


}
