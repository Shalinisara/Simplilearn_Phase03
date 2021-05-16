package com.shoes.service;

import java.util.List;

import com.shoes.model.User;
import com.shoes.model.XOrder;

public interface UserCRUDService {
	public User createUser(User user);
	public User updateUser(User user);
	public List<User> getAllUSers();
//	public List<User> getUsersByFname(String fname);
//	public List<User> getUsersByLname(String lname);
	
}
