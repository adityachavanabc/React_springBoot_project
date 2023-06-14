package com.boot.VSC.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.boot.VSC.model.User;
import com.boot.VSC.service.UserService;

@RestController
@CrossOrigin(origins = "*")
public class UserController {

	@Autowired
	UserService userService;
	
	@PostMapping("/user")
	public User createUser (@RequestBody User user) {
		return userService.createUser(user);
	}
	
	@GetMapping("/user/{id}")
	public User getById(@RequestParam int id) {
		return userService.getById(id);
	}
	
//	@GetMapping("/user")
//	public User getById(@RequestParam("id") Integer id) {
//		
//		return userService.getById(id);
//	}
	
	//@PutMapping("/user/{id}")
	//public User updateUser (@RequestBody User user, @PathVariable int id) {
	//	return userService.updateUser(user, id);
	//}
	
	@GetMapping("/user/{userName}/{password}")
	public Optional<User> getUserByUserNameAndPass (@PathVariable("userName") String userName, 
			@PathVariable("password") String password){
		return userService.getUserByUserNameAndPass(userName, password);
	}
	
	@DeleteMapping("/user/{id}")
	public void deleteUser(@PathVariable int id) {
		userService.deleteUser(id);
	}
}
