package com.shoes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shoes.model.User;
import com.shoes.service.UserCRUDService;

@RestController
public class UserCRUDController {
	
	@Autowired
	private UserCRUDService usercrudservice;
	
	@PostMapping("/user")
	public User createUser(@RequestBody User user) {
		// TODO Auto-generated method stub
		System.out.println("in controller");
		System.out.println(user.toString());
		return usercrudservice.createUser(user);
	}

	@PutMapping("/user")
	public User updateUser(@RequestBody User user) {
		// TODO Auto-generated method stub
		return usercrudservice.updateUser(user);
	}

	@GetMapping("/users")
	public List<User> getAllUSers() {
		// TODO Auto-generated method stub
		return usercrudservice.getAllUSers();
	}
	
//	@GetMapping("/users/fname/{fname}")
//	public List<User> getUsersByFname(@PathVariable String fname){
//		return usercrudservice.getUsersByFname(fname);
//	}
//	
//	@GetMapping("/users/lname/{lname}")
//	public List<User> getUsersByLname(@PathVariable String lname){
//		return usercrudservice.getUsersByFname(lname);
//	}
	

}
