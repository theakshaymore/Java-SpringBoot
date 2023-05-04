package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;
import com.example.demo.persistance.ProductRepository;


@Service
public class ServiceImplementation implements ServiceDeclaration {
	
	private ProductRepository productRepository;
	
	@Autowired
	public ServiceImplementation(ProductRepository productRepository) {

		this.productRepository = productRepository;
	}

	@Override
	@Transactional
	public List<Product> displayAlldata() {
		return productRepository.findAll();
	}

	@Override
	@Transactional
	public void deleteById(int id) {
		productRepository.deleteById(id);
		
	}

	@Override
	public List<Product> searchProductByProductId(String id) {
		List<Product> products = productRepository.searchProductByProductId(id);
		return products;
	}



}
