package com.example.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.model.User;
import com.example.project.service.UserService;

@RestController
@RequestMapping(path = "/users")
public class UserController {
	@Autowired
	private UserService userService;

	@GetMapping(path = "/index")
	public ResponseEntity<Iterable<User>> getAllUsers() {
		Iterable<User> users = userService.getAllUsers();
        return ResponseEntity.ok(users);
	}
}
