package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Product;

public interface ServiceDeclaration {
	
	public List<Product> displayAlldata();
	
	public Product displayById(int id);
	
	public void insertProduct(Product product);
	
	public void updateProductDetails(Product product);
	
	public void deleteById(int id);
}
