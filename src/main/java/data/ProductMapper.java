package data;

import connection.EntityManagerFactoryProvider;
import model.Product;

import javax.persistence.EntityManager;


public class ProductMapper {


    private ProductMapper productMapper;

    public Product createProduct(Product product) {
        EntityManager entityManager = EntityManagerFactoryProvider.getEM();
        entityManager.persist(product);
        entityManager.getTransaction().begin();
        entityManager.getTransaction().commit();
        entityManager.close();
        return product;
    }

    public Product getProduct(Integer id) {
        EntityManager entityManager = EntityManagerFactoryProvider.getEM();
        Product product = entityManager.find(Product.class, id);
        entityManager.getTransaction().begin();
        entityManager.getTransaction().commit();
        entityManager.close();
        return product;
    }

    public Product deleteProduct(Product product) {
        EntityManager entityManager = EntityManagerFactoryProvider.getEM();
        entityManager.remove(product);
        entityManager.getTransaction().begin();
        entityManager.getTransaction().commit();
        entityManager.close();
        return product;
    }

    public Product updateProduct(Product product) {

        return product;
    }

}
