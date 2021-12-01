package com.arcadia.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.arcadia.user.links.UserLinks;
import com.arcadia.user.model.User;
import com.arcadia.user.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController("/api")
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping(path = UserLinks.LIST_USERS)
	public ResponseEntity<?> listUsers() {

		log.info("UserController: list users");
		List<User> resource = userService.getUsers();

		return ResponseEntity.ok(resource);
	}

	@PostMapping(path = UserLinks.ADD_USER)
	public ResponseEntity<?> saveUser(@RequestBody User user) {

		log.info("UserController: list users");
		User resource = userService.saveUser(user);

		return ResponseEntity.ok(resource);
	}
}
