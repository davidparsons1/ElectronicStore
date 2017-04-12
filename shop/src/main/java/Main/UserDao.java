package Main;

import java.util.List;
import Persistance.PersistenceUtil;
import entity.User;




public class UserDao {
	
	public static void main(String[] args){
		UserDao config = new UserDao();
		
		
	}

	public UserDao(){
		 User p = new User("Bill", "hello");
		createUser(p);
	}


	public void viewUser(){
		List<User> users = PersistenceUtil.findAllUsers();
		for(User s:users){
			System.out.println("User "+s.getUsername()+ " exists.");
		}
	}
	
	
	public static void createUser(User u){


		PersistenceUtil.persist(u);
		System.out.println("User registered");
	}
			

}
