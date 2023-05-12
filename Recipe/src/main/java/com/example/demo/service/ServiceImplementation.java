package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.entity.User;
import com.example.demo.persistance.UserRepository;

@Service
public class ServiceImplementation implements ServiceDeclaration {

	private UserRepository userRepository;

	@Autowired
	public ServiceImplementation(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	@Transactional
	public List<User> displayAlldata() {
		List<User> list = userRepository.findAll();
		return list;
	}

	@Override
	@Transactional
	public User displayById(int id) {
		return userRepository.findById(id).get();
	}

	@Override
	@Transactional
	public void insertUser(User user) {
		userRepository.save(user);
	}

	@Override
	@Transactional
	public void updateUser(User user) {
		userRepository.save(user);
	}

	@Override
	@Transactional
	public void deleteUser(int id) {
		userRepository.deleteById(id);
	}

}
