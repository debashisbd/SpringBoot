package com.example.demo.post;

import java.util.List;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
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
}
