package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
//@RequestMapping("api/users")
public class UserController {
	@Autowired
	private UserService userService;

	@GetMapping("listUsers")
	public List<User> getAllUsers()
	{
		return userService.getAllUsers();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<User> getUserById(@PathVariable Long id)
	{
		return userService.geyUserById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	}
	@PostMapping("/createUser")
	public User createUser(@RequestBody User user)
	{
		return userService.createUser(user);
	}
}
