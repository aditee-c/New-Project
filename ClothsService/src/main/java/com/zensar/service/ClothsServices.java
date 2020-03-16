package com.zensar.service;

import java.util.List;

import com.zensar.entities.ClothsEntity;

public interface ClothsServices {

	List<ClothsEntity> findAllCloths();
	ClothsEntity findClothById(int productid);
	void addCloth(ClothsEntity cloths);
	void updateCloth(ClothsEntity cloths);
	void deleteCloth(ClothsEntity cloths);
	List<ClothsEntity> findClothByuserId(int userid);
}
