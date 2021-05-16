package com.shoes.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoes.model.User;
import com.shoes.model.XOrder;
import com.shoes.repository.UserRepository;
import com.shoes.service.UserCRUDService;

@Service
public class UserCRUDServiceImpl implements UserCRUDService  {
	
	@Autowired
	private UserRepository userrepo;

	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		System.out.println("in Impl");
		System.out.println(user.toString());
		return userrepo.save(user);
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return userrepo.save(user);
	}

	@Override
	public List<User> getAllUSers() {
		// TODO Auto-generated method stub
		return userrepo.findAll();
	}

	
	//	@Override
//	public List<User> getUsersByFname(String fname) {
//		// TODO Auto-generated method stub
//		return userrepo.findByFname(fname);
//	}
//
//	@Override
//	public List<User> getUsersByLname(String lname) {
//		// TODO Auto-generated method stub
//		return userrepo.findByLname(lname);
//	}

}
