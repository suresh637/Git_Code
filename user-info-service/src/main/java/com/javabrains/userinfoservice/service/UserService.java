package com.javabrains.userinfoservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javabrains.userinfoservice.entity.User;
import com.javabrains.userinfoservice.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;
	
	public List<User> getUsers()
	{
		return userRepo.findAll();
	}
	
	public User getUser(int userId)
	{
		User user =userRepo.findById(userId).get();
		return user;
	}
	
	public User saveUser(User user)
	{
		return userRepo.save(user);
	}
	
	public User deleteUser(int userId)
	{
		return userRepo.deleteByUserId(userId);
	}
}
