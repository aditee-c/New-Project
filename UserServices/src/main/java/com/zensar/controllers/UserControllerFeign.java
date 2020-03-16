package com.zensar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.UserServiceProxy;
import com.zensar.entities.UserClothEntity;
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserControllerFeign {
	@Autowired
	private UserServiceProxy proxy;
	@RequestMapping("/clothByUid/{id}")
	public List<UserClothEntity> ClothByuserId(@PathVariable("id") int userid) {
		return  proxy.ClothByuserId(userid);
	
	}
	
	
	}
