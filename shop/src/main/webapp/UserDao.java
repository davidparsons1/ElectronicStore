package main;

import java.util.List;
import persistence.PersistenceUtil;
import entity.Library;
import entity.Playlists;
import entity.User;




public class UserDao {
	
	public static void main(String[] args){
		UserDao config = new UserDao();
		
		
	}

	public UserDao(){
		 User p = new User("Bill", "hello",1);
		 Library l= new Library();
		createUser(p,l);
	}


	public void viewUser(){
		List<User> users = PersistenceUtil.findAllUsers();
		for(User s:users){
			System.out.println("User "+s.getUsername()+ " exists.");
		}
	}
	
	
	public static void createUser(User u,Library l){


		PersistenceUtil.persist(u);
		PersistenceUtil.persist(l);
		System.out.println("User registered");
	}
			

}
