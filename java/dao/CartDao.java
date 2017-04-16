package dao;

import entity.Cart;
import entity.User;
import persistence.PersistenceUtil;

/**
 * Created by David on 16/04/2017.
 */
public class CartDao {

    public static void addToCart(Cart c){
        PersistenceUtil.persist(c);
        System.out.println("Added to cart");
    }


}
