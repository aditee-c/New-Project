package com.zensar.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.zensar.entities.ClothsEntity;
@Repository
@CrossOrigin(origins = "http://localhost:4200")
public class ClothDaoImpl  implements ClothesDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	

	@Override
	public List<ClothsEntity> getAll() {
		
		return (List<ClothsEntity>) hibernateTemplate.find("from ClothsEntity");

	}

	@Override
	public ClothsEntity getById(int productid) {
		// TODO Auto-generated method stub
		return hibernateTemplate.get(ClothsEntity.class, productid);
	}

	@Override
	public void insert(ClothsEntity cloth) {
		// TODO Auto-generated method stub
		hibernateTemplate.save(cloth);
	}

	@Override
	public void update(ClothsEntity cloth) {
		// TODO Auto-generated method stub
		hibernateTemplate.update(cloth);
	}

	@Override
	public void delete(ClothsEntity cloth) {
		// TODO Auto-generated method stub
		hibernateTemplate.delete(cloth);
	}

//	@Override
//	public ClothsEntity getByuserId(int userId) {
//		// TODO Auto-generated method stub
//		return  hibernateTemplate.get(ClothsEntity.class, userId);
//		//return (List<ClothsEntity>) hibernateTemplate.find("from ClothsEntity where userId = " + userId);
//	}

}
