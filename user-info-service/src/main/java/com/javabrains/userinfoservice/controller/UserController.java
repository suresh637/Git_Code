package com.javabrains.userinfoservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javabrains.userinfoservice.entity.User;
import com.javabrains.userinfoservice.service.UserService;

@RestController
@RequestMapping("/")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public List<User> getUsers()
	{
		return userService.getUsers();
	}
	
	@GetMapping("/user/{userId}")
	public User getUser(@PathVariable int userId)
	{
		return userService.getUser(userId);
	}
	
	@PostMapping("/saveUsers")
	public User saveUser(@RequestBody User user)
	{
		System.out.println("control is here");
		return userService.saveUser(user);
	}

}
