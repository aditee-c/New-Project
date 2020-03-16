package com.zensar.service;

import java.util.List;

import com.zensar.entities.UserEntity;

public interface UserService {
	List<UserEntity> findAllUser();

	UserEntity findUserById(int userId);

	void addUser(UserEntity user);

	void updateUser(UserEntity user);

	void deleteUser(UserEntity user);
	
	
}
