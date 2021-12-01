package com.arcadia.user.service;

import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

import com.arcadia.user.model.User;
import com.arcadia.user.repository.UserRepository;

@Component
public class UserService {

	private UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public List<User> getUsers() {
		return userRepository.findAll();
	}

	public User saveUser(User user) {
		user.setId(new Random().nextInt());
		return userRepository.save(user);
	}

}
