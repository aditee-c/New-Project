package com.zensar.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.dao.UserDao;
import com.zensar.entities.UserEntity;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userdao;

	@Override
	public List<UserEntity> findAllUser() {
		// TODO Auto-generated method stub
		return userdao.getAll();
	}

	@Override
	public UserEntity findUserById(int userId) {
		// TODO Auto-generated method stub
		return userdao.getById(userId);
	}

	@Override
	public void addUser(UserEntity user) {
		// TODO Auto-generated method stub
		userdao.insert(user);

	}

	@Override
	public void updateUser(UserEntity user) {
		// TODO Auto-generated method stub
		userdao.update(user);

	}

	@Override
	public void deleteUser(UserEntity user) {
		// TODO Auto-generated method stub
		userdao.delete(user);

	}

}
