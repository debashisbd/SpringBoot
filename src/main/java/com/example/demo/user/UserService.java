package com.example.demo.user;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.location.Location;
import com.example.demo.post.Post;

@Service
public class UserService {
	
	User user1 = new User(
			"u1", 
			"Jany", 
			"Lawrence",
			new Location("l1", "Lagos"),
			"Jany@gmail.com");
			
		User user2 = new User(
			"u2", 
			"Jadon", 
			"Mills",
			new Location("l2", "Asaba"),
			"Jadon@gmail.com");
	
		
		List<User> users =new ArrayList<>( Arrays.asList(user1, user2));
		
		
	 public List<User> getAllUsers() {		
			return users; 	
			
		   }
	 
	 
	 public User getUser(String id) {
		 
		 User user = users.stream().filter(t-> id.equals(t.getId())).findFirst().orElse(null);
		
		return user;
		 
	 }
	 
	 
	 
	 public void addUser(User user) {
		 users.add(user);
		 
	 }
		 
	 
	 
	 
	 public void updateUser(String id, User user) {

		    for(int i = 0; i < users.size(); i++) {

			User u = users.get(i);

			if(u.getId().equals(id)) {

			     users.set(i, user);

			     return;
			}
		    }
		}
	 
	 
	 public void deleteUser(String id) {
	     users.removeIf(u -> u.getId().equals(id));		
	}
	 
	 
	 
}
