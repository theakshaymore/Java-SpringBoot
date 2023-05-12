package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.User;
import com.example.demo.service.ServiceImplementation;

@Controller
@RequestMapping("/user")
public class UserController {
	
	private ServiceImplementation serviceImplementation;
	

	@Autowired
	public UserController(ServiceImplementation serviceImplementation) {
		super();
		this.serviceImplementation = serviceImplementation;
	}
	
	@GetMapping("list")
	public List<User> displayAlldata(){
		List<User> users =  serviceImplementation.displayAlldata();
		return users;
	}
	
	@GetMapping("list/{id}")
	public User displayById(@PathVariable("id") int id){
		return serviceImplementation.displayById(id);
	}
	
	@PostMapping("list")
	public void insertUser(@RequestBody User user) {
		serviceImplementation.insertUser(user);
	}
	
	@PutMapping("list")
	public void updateUser(@RequestBody User user) {
		serviceImplementation.updateUser(user);
	}
	
	@DeleteMapping("list/{id}")
	public void deleteUser(@PathVariable("id") int id) {
		serviceImplementation.deleteUser(id);
	}
}
