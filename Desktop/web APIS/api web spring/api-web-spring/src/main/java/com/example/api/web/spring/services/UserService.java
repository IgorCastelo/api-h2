package com.example.api.web.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api.web.spring.entities.User;
import com.example.api.web.spring.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
		public List<User> findAll(){
			return userRepository.findAll();
		}
	}