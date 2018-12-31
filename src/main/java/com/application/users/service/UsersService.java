package com.application.users.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.users.dao.UsersDao;
import com.application.users.model.User;

@Service
public class UsersService {

	@Autowired
	private UsersDao usersDao;

	public Iterable<User> getUsers() {
		return usersDao.findAll();
	}

	public User save(User user) {
		return usersDao.save(user);
	}

	public User createUser(User user) {
		return usersDao.save(user);
	}

	public void deleteUser(Long userId) {
		usersDao.deleteById(userId);
	}

	public User updateUser(User user) {
		Long userId = user.getId();
		Optional<User> userOptional = usersDao.findById(userId);
		if(userOptional.isPresent()) {
			return usersDao.save(user);
		}
		return null;
	}
}
