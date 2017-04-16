package dao;

import java.util.List;

/**
 * Created by David on 14/04/2017.
 */
import entity.Product;
import persistence.PersistenceUtil;
import entity.User;
import javax.persistence.EntityManager;

public class productDao {

    public void createProduct(Product p){
        PersistenceUtil.persist(p);
        System.out.println("Product registered");
    }

    public List<Product> findAllProducts(){
        EntityManager em = PersistenceUtil.createEM();
        List<Product> products = (List<Product>)
                em.createNamedQuery("Product.findAll").getResultList();
        em.close();

        return products;



    }

    public Product findProductByTitle(String title){

        EntityManager em = PersistenceUtil.createEM();
        List<Product> products = (List<Product>)
                em.createNamedQuery("Product.findByTitle").
                        setParameter("title", title).getResultList();
        em.close();

        if (products.size() == 0) {
            return null;
        } else
            return products.get(0);
    }


}


