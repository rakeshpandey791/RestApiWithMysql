package com.rakesh.service.Impl;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rakesh.entity.User;
import com.rakesh.repository.UserRepository;
import com.rakesh.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Resource
	private UserRepository userRepo;

	@Autowired
	UserProfileServiceImpl userProfileServiceImpl;

	@Override
	public List<User> findAllUsers() {
		return userRepo.findAll();
	}

	@Override
	public Optional<List<User>> findUserByName(String name) {
		return userRepo.findByName(name);
	}

	@Override
	public User createUser(User user) {

		user.setCreatedOn(new Date());
		user.setDob(new Date());

		User userPersisted = userRepo.save(user);
		userProfileServiceImpl.CreateUserProfile(userPersisted);

		return userPersisted;
	}

	@Override
	public User findUserById(Integer id) {
		return userRepo.findOne(id);
	}

	@Override
	public User updateUser(User user) {

		User persistedUser = userRepo.findOne(user.getId());
		persistedUser.setName(user.getName());
		return userRepo.save(persistedUser);

	}

	@Override
	public void deleteUserById(Integer id) {
		userRepo.delete(id);
	}

	@Override
	public void deleteAllUser() {
		
		userRepo.deleteAll();
	}
}
