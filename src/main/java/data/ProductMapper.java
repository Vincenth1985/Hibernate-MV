package data;

import connection.EntityManagerFactoryProvider;
import model.Product;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;


public class ProductMapper {


    private ProductMapper productMapper;

    public Product createProduct(Product product) {
        EntityManager entityManager = EntityManagerFactoryProvider.getEM();
        entityManager.getTransaction().begin();
        entityManager.persist(product);
        entityManager.getTransaction().commit();
        entityManager.close();
        return product;
    }

    public Product getProduct(Integer id) {
        EntityManager entityManager = EntityManagerFactoryProvider.getEM();
        entityManager.getTransaction().begin();
        Product product = entityManager.find(Product.class, id);
        entityManager.getTransaction().commit();
        entityManager.close();
        return product;
    }

    public Product deleteProduct(Product product) {
        EntityManager entityManager = EntityManagerFactoryProvider.getEM();
        entityManager.getTransaction().begin();
        entityManager.remove(product);
        entityManager.getTransaction().commit();
        entityManager.close();
        return product;
    }

    public Product updateProduct(Product product) {

        EntityManager em = EntityManagerFactoryProvider.getEM();
        EntityTransaction transaction = em.getTransaction();

        transaction.begin();
        Product dbProduct = em.find(Product.class, product.getId());
        dbProduct.cloneFrom(product);
        transaction.commit();

        em.close();
        return dbProduct;

    }

}
