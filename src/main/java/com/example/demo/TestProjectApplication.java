package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;


@SpringBootApplication
public class TestProjectApplication {
	
	
	public static void main(String[] args) {
		SpringApplication.run(TestProjectApplication.class, args);
		
		TestClass mytest = new TestClass();
		mytest.usrname();
		
	}

}
