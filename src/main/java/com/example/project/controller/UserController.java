package com.example.project.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.entity.User;
import com.example.project.repository.UserRepository;

@RestController
@RequestMapping(path = "/api/v1/users")
public class UserController {
	@Autowired

	private UserRepository userRepository;
	
	@GetMapping(path = "/test")
	public String test() {
		return "Testing";
	}

	@GetMapping(path = "/index")
	public @ResponseBody Iterable<User> getAllUsers() {
		// This returns a JSON or XML with the users
		return userRepository.findAll();
	}

}
