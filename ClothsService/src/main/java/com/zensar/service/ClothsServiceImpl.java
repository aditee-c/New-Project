package com.zensar.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.dao.ClothesDao;
import com.zensar.entities.ClothsEntity;
@Service
@Transactional
public class ClothsServiceImpl implements ClothsServices {

	@Autowired
	private ClothesDao clothsdao;
	
	@Override
	public List<ClothsEntity> findAllCloths() {
		 //TODO Auto-generated method stub
		return clothsdao.getAll();
	}

	@Override
	public ClothsEntity findClothById(int productid) {
		// TODO Auto-generated method stub
		return clothsdao.getById(productid);
	}

	@Override
	public void addCloth(ClothsEntity cloths) {
		// TODO Auto-generated method stub
		clothsdao.insert(cloths);
	}

	@Override
	public void updateCloth(ClothsEntity cloths) {
		// TODO Auto-generated method stub
		clothsdao.update(cloths);
	}

	@Override
	public void deleteCloth(ClothsEntity cloths) {
		// TODO Auto-generated method stub
		clothsdao.delete(cloths);
	}

	@Override
	public List<ClothsEntity> findClothByuserId(int userid) {
		// TODO Auto-generated method stub
		List<ClothsEntity> all = clothsdao.getAll();
		List<ClothsEntity> filterByUserid= new ArrayList<>();
		
		for (ClothsEntity cloths : all) {
			if(cloths.getUserId()==userid) {
				filterByUserid.add(cloths);
			}
		}
	

		return filterByUserid;
	}

}
