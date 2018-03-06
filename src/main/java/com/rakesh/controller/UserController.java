package com.rakesh.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rakesh.entity.User;
import com.rakesh.entity.UserProfile;
import com.rakesh.service.Impl.UserServiceImpl;

@RestController
@RequestMapping("/api/user/v1")
@CrossOrigin("*")
public class UserController {

	@Autowired
	UserServiceImpl userServiceImpl;

	@GetMapping(value = "/all")
	public List<User> getAllUsers() {

		return userServiceImpl.findAllUsers();
	}

	@GetMapping(value = "/user/name/{name}")
	public List<User> getUserByName(@PathVariable("name") final String name) {

		Optional<List<User>> listOfUsers = userServiceImpl.findUserByName(name);
		List<User> listOfUsr = listOfUsers.orElse(new ArrayList<>());
		return listOfUsr;
	}

	@PostMapping(value = "/user/create")
	public User createUser(@RequestBody User user) {

		return userServiceImpl.createUser(user);
	}

	@GetMapping(value = "/user/id/{id}")
	public User getUserById(@PathVariable("id") Integer id) {

		return userServiceImpl.findUserById(id);
	}

	@PutMapping(value = "/user/update")
	public User updateUser(@RequestBody User user) {

		return userServiceImpl.updateUser(user);
	}

	@DeleteMapping(value = "/user/delete/{id}")
	public void deleteUserById(@PathVariable("id") Integer id) {

		userServiceImpl.deleteUserById(id);
	}

	@DeleteMapping(value = "/user/delete")
	public void deleteAll() {
		userServiceImpl.deleteAllUser();
	}

	public UserProfile updateUserProfile(UserProfile userProfile) {
		return null;
	}

}
