package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;
import com.example.demo.persistance.PersistanceImplementation;

@Service
public class ServiceImplementation implements ServiceDeclaration {
	
	private PersistanceImplementation persistanceImplementation;
	
	@Autowired
	public ServiceImplementation(PersistanceImplementation persistanceImplementation) {
		super();
		this.persistanceImplementation = persistanceImplementation;
	}
	
	@Override
	@Transactional
	public List<Product> displayAlldata() {
		return persistanceImplementation.displayAll();
	}

	@Override
	@Transactional
	public Product displayById(int id) {
		return persistanceImplementation.displayBasedOnId(id);
	}

	@Override
	@Transactional
	public void insertProduct(Product product) {
		persistanceImplementation.insertProduct(product);
	}

	@Override
	@Transactional
	public void updateProductDetails(Product product) {
		persistanceImplementation.updateProduct(product);
	}

	@Override
	@Transactional
	public void deleteById(int id) {
		persistanceImplementation.deleteById(id);
		
	}

}
