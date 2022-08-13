package com.example.demo.user;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.location.Location;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	 @RequestMapping(value="/users")	

	 public List<User> getUser(){
		 
		 return userService.getAllUsers();
	 }
	 
	 
	 @RequestMapping(value="/users/{id}")
	 public User getUser(@PathVariable String id) {
		 
		 return userService.getUser(id);
	 }
	 
	 
	 
	 @RequestMapping(value="/users/add", method = RequestMethod.POST)
	 public void addLocation(@RequestBody User user) {
		 
		 userService.addUser(user);
	 }
	 
	 
	 @RequestMapping(value="/users/update/{id}", method = RequestMethod.PUT)
	 public void getUser(@PathVariable String id, @RequestBody User user) {

	     userService.updateUser(id, user);

	 }
	 
	 
	 @RequestMapping(value = "/users/delete/{id}", method = RequestMethod.DELETE)
	 public void deleteUser(@PathVariable String id) {
	      userService.deleteUser(id);
	 }
}
