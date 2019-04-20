package com.websystique.springboot.service;


import com.websystique.springboot.model.User;

import java.util.List;

public interface UserService {
	
	User findById(Long id);

	void saveUser(User user);

	void updateUser(User user);

	void deleteUserById(Long id);

	void deleteAllUsers();

	List<User> findAllUsers();

}