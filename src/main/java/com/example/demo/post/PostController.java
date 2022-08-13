package com.example.demo.post;

import java.util.List;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.location.Location;
import com.example.demo.user.User;

@RestController
public class PostController {

	@Autowired
	private PostService postService;
	
	@RequestMapping(value = "/posts")
	
	public List<Post> getPosts(){
		
		return postService.getAllPosts();
	}
	
	
	
	@RequestMapping(value="/posts/{id}")
	 public Post getUser(@PathVariable String id) {
		 
		 return postService.getPostbyId(id);
	 }
	
	
	 @RequestMapping(value="/posts/add", method = RequestMethod.POST)
	 public void addLocation(@RequestBody Post post) {
		 
		 postService.addPost(post);
		 
	 }
	 
	 
	 @RequestMapping(value="/posts/update/{id}", method = RequestMethod.PUT)
	 public void updatePost(@PathVariable String id, @RequestBody Post post) {

	       postService.updatePost(id, post);

	 }
	 
	 
	 @RequestMapping(value = "/posts/delete/{id}", method = RequestMethod.DELETE)
	 public void deletePost(@PathVariable String id) {
	     postService.deletePost(id);
	 }
}
