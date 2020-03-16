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

import com.zensar.entities.UserEntity;
import com.zensar.service.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

	
	@Autowired
	private UserService userService;

	
	@RequestMapping("/user/list")
	public List<UserEntity> getAllUser() {
		return userService.findAllUser();
	}

	@RequestMapping("/user/{id}")
	public UserEntity UserById(@PathVariable("id") int userid) {
		return userService.findUserById(userid);
	}

	@PostMapping("/user/add")
	public String addUser(@RequestBody UserEntity user) {
		userService.addUser(user);
		return "User is added";

	}

	@PutMapping("/user/update")
	public String updateUser(@RequestBody UserEntity user) {
		userService.updateUser(user);
		return "User is updated";

	}

	@DeleteMapping("/user/delete")
	public String deleteUser(@RequestBody UserEntity user) {
		userService.deleteUser(user);
		return "user is deleted";

	}

}
