package com.zensar.dao;

import java.util.List;

import com.zensar.entities.UserEntity;

public interface UserDao {
	List<UserEntity> getAll();

	UserEntity getById(int userId);

	void insert(UserEntity user);

	void update(UserEntity user);

	void delete(UserEntity user);

}
