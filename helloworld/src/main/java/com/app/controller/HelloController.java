package com.app.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/")
	public String helloFromGet(){
		return "Hello and Welcome to GET method";
	}
	
	@PostMapping("/")
	public String helloFromPost(){
		return "Hello and Welcome to POST method";
	}
	@PutMapping("/")
	public String helloFromPut(){
		return "Hello and Welcome to PUT method";
	}
	@DeleteMapping("/")
	public String helloFromDelete(){
		return "Hello and Welcome to DELETE method";
	}
}
