package com.rakesh.service;

import java.util.List;
import java.util.Optional;

import com.rakesh.entity.User;

public interface UserService {

	List<User> findAllUsers();

	Optional<List<User>> findUserByName(String name);

	User createUser(User user);

	User findUserById(Integer id);

	User updateUser(User user);

	void deleteUserById(Integer id);
	
	void deleteAllUser();

}