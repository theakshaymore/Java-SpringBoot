package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Product;

public interface ServiceDeclaration {
	
	public List<Product> displayAlldata();
	
	public void deleteById(int id);
	
	public List<Product> searchProductByProductId(String id);
}
