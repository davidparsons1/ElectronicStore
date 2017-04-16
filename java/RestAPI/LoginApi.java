package RestAPI;

import javax.ws.rs.Path;
import com.fasterxml.jackson.databind.ObjectMapper;
import dao.*;
import entity.*;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Path("/hello")
public class LoginApi {

    UserDao userDao = new UserDao();

    @GET
    @Path(value="/hello")
    @Produces(value={"application/json"})
    public String Hello(){
        return "Hello World";
    }


    @POST
    @Path( value = "/loginUser")
    @Produces(value={"application/json"})
    public User loginCustomer(String userJson){
        User user = null;
        try {
            user = mapUsers(userJson);

        } catch (IOException e) {
            e.printStackTrace();
        }

        assert user != null;
        User u =userDao.findUserByUsername(user.getUsername());
        if(user.getPassword().equals(u.getPassword()))
            return user;
        else
            return null;
    }


    private User mapUsers(String customerJson) throws IOException {
        User user = null;
        user = new ObjectMapper().readValue(customerJson, User.class);

        return user;

    }

}
