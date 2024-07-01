package com.example.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.model.User;
import com.example.project.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public Iterable<User> getAllUsers() {
		return userRepository.findAll();
	}
}
