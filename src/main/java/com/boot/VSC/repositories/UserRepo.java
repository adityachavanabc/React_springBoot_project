package com.boot.VSC.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boot.VSC.model.User;
@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

	Optional<User> findByUserNameAndPassword(String userName, String password);

	
}
