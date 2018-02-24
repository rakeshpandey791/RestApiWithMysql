package com.rakesh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rakesh.entity.User;
import com.rakesh.repository.UserRepository;

@RestController
@RequestMapping("/api/user/v1")
@CrossOrigin("*")
public class UserController {

	@Autowired
	private UserRepository userRepo;
	
	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public List<User> getUsers(){
		return userRepo.findAll();
	}
	
	@RequestMapping(value = "/user/create", method = RequestMethod.POST)
	public User createUser(@RequestBody final User user){
		return userRepo.save(user);
		//return userRepo.findAll();
	}
	
}
