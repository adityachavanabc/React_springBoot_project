package com.boot.VSC.service;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.boot.VSC.model.User;
import com.boot.VSC.repositories.UserRepo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo userRepo;
	
	@Override
	public User createUser(User usr) {
		User user = userRepo.save(usr);
		return user;
	}

	@Override
	public User updateUser(User user, Integer id) {
		user.setUserId(id);
		userRepo.save(user);
		return user;
	}

	@Override
	public Optional<User> getUserByUserNameAndPass(String userName, String password) {
			Optional<User> user = null;
			user = userRepo.findByUserNameAndPassword(userName, password);
			return user;
	}

	@Override
	public void deleteUser(Integer userId) {
		userRepo.deleteById(userId);
		
	}

	@Override
	public User getById(Integer id) {
		return userRepo.findById(id).get();
	}
	
	

}
