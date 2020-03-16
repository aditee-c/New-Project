package com.zensar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.entities.ClothsEntity;
import com.zensar.service.ClothsServices;
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ClothsController {
	
	@Autowired
	private ClothsServices clothsservice;
	
	@RequestMapping("/cloth/list")
	public List<ClothsEntity> getAllCloths() {
		return clothsservice.findAllCloths();
	}

	@RequestMapping("/cloth/{id}")
	public ClothsEntity ClothById(@PathVariable("id") int clothid) {
		return clothsservice.findClothById(clothid);
	}
	@RequestMapping("/clothByUid/{id}")
	public List<ClothsEntity> ClothByuserId(@PathVariable("id") int userid) {
		return  clothsservice.findClothByuserId(userid);
	}
	@PostMapping("/cloth/add")
	public String addCloths(@RequestBody ClothsEntity cloth) {
		clothsservice.addCloth(cloth);
		return "Cloths are added";
		
	}
	@PutMapping("/cloth/update")
	public String updateCloths(@RequestBody ClothsEntity cloth) {
		clothsservice.updateCloth(cloth);;
		return "Cloths are updated";
		
	}
	@DeleteMapping("/cloth/delete")
	public String deleteCloths(@RequestBody ClothsEntity cloth) {
		clothsservice.deleteCloth(cloth);
		return "Cloths are deleted";
		
	}
}
