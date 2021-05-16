package com.shoes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shoes.model.User;



@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

//	public List<User> findByFname(String fname);
//
//	public List<User> findByLname(String lname);


}
