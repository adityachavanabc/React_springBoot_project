package com.boot.VSC.service;
import java.util.Optional;

import com.boot.VSC.model.User;

public interface UserService {

	User createUser(User user);
	
	User updateUser(User user, Integer userId);
	
	 Optional<User> getUserByUserNameAndPass(String userName, String password );
	
	// User getUserById(Integer userId);
	
	// List<User> getAllUsers();
	
	void deleteUser(Integer userId);

	User getById(Integer id);

}
