package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepo;
	public List<User> getAllUsers()
	{
		return userRepo.findAll();
	}
	public Optional<User> geyUserById(Long id)
	{
		return userRepo.findById(id);
		
	}
	
	public User createUser(User user)
	{
		return userRepo.save(user);
	}

}
