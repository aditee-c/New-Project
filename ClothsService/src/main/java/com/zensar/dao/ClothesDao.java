package com.zensar.dao;

import java.util.List;

import com.zensar.entities.ClothsEntity;
public interface ClothesDao {

	List<ClothsEntity> getAll();
	//ClothsEntity getByuserId(int userId);

	ClothsEntity getById(int productId);
	void insert (ClothsEntity cloth);
	void update(ClothsEntity cloth);
	void delete (ClothsEntity cloth);
}
