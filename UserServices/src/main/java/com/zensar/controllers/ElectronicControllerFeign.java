package com.zensar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.UserServiceElectronicsProxy;
import com.zensar.UserServiceProxy;
import com.zensar.entities.UserElectronicEntity;
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ElectronicControllerFeign {
	
	@Autowired
	private UserServiceElectronicsProxy proxy;
	
	@RequestMapping("/productByUid/{id}")
	public List<UserElectronicEntity> ProductByuserId(@PathVariable("id") int productid) {
		return  proxy.ProductByuserId(productid);
	}

}
