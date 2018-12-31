package com.application.users.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.application.users.model.User;
import com.application.users.service.UsersService;

@RestController
public class UsersController {

	@Autowired
	private UsersService usersService;

	@GetMapping("users")
	public Iterable<User> getUsers() {
		return usersService.getUsers();
	}

	@PostMapping("createuser")
	public User createUser(@RequestBody User user) {
		return usersService.createUser(user);
	}

	@DeleteMapping("delete/{userId}")
	public void deleteUser(@PathVariable Long userId) {
		usersService.deleteUser(userId);
	}
	
	@PutMapping("updateUser")
	public User updateUser(@RequestBody User user) {
		return usersService.updateUser(user);
	}
}
