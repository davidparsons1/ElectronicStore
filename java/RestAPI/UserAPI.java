package RestAPI;

import com.fasterxml.jackson.databind.ObjectMapper;
import dao.*;
import entity.*;

import javax.ws.rs.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Path("/api")
public class UserAPI {


  private UserDao userDao = new UserDao();
  private productDao productDao = new productDao();



    @GET
    @Path(value="/hello")
    @Produces(value={"application/json"})
    public String Hello(){
        return "Hello World";
    }



    @GET
    @Path(value="/getAllUsers")
    @Produces(value={"application/json"})
    public List<User> getUsers() {

        List<User> resultList = userDao.findAllUsers();
       return resultList;
    }

    @POST
    @Path(value="/createUser")
    public void createUser(String userInfoInJson){
        User user = null;
        try {
            user = mapUser(userInfoInJson);
        } catch (Exception e) {
            e.printStackTrace();
        }

        userDao.createUser(user);
    }

    public User mapUser(String userInfoInJson) throws Exception{
        User user = null;

        user = new ObjectMapper().readValue(userInfoInJson, User.class);

        return  user;
    }

    @POST
    @Path(value="/createProduct")
    public void createProduct(String productJson){
        Product product = null;
        try {
            product = mapProduct(productJson);
        } catch (Exception e) {
            e.printStackTrace();
        }

        productDao.createProduct(product);
    }

    public Product mapProduct(String productInfoInJson) throws Exception{
        Product product = null;

        product = new ObjectMapper().readValue(productInfoInJson, Product.class);

        return  product;
    }

    @POST
    @Path(value="/addToCart")
    public void addToCart(Product p){

      String t = p.getTitle();
      double pr = p.getPrice();

      Cart c = new Cart(t,pr);

      CartDao.addToCart(c);

    }

    @GET
    @Path(value="/getAllProducts")
    @Produces(value={"application/json"})
    public List<Product> getProducts() {

        List<Product> resultList = productDao.findAllProducts();
        return resultList;
    }


}
