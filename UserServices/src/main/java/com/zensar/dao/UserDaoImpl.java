package com.zensar.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.zensar.entities.UserEntity;

@Repository
@CrossOrigin(origins = "http://localhost:4200")
public class UserDaoImpl implements UserDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public List<UserEntity> getAll() {
		// TODO Auto-generated method stub
		return (List<UserEntity>) hibernateTemplate.find("from UserEntity");
	}

	@Override
	public UserEntity getById(int userId) {
		// TODO Auto-generated method stub
		return hibernateTemplate.get(UserEntity.class, userId);
	}

	@Override
	public void insert(UserEntity user) {
		// TODO Auto-generated method stub
		hibernateTemplate.save(user);

	}

	@Override
	public void update(UserEntity user) {
		// TODO Auto-generated method stub
		hibernateTemplate.update(user);

	}

	@Override
	public void delete(UserEntity user) {
		// TODO Auto-generated method stub
		hibernateTemplate.delete(user);

	}

}
