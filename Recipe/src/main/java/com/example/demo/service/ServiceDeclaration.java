package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.User;

public interface ServiceDeclaration {
	
	public List<User> displayAlldata();
	
	public User displayById(int id);
	
	public void insertUser(User user);
	
	public void updateUser(User user);
	
	public void deleteUser(int id);
}
