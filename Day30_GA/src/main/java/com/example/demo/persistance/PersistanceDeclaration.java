package com.example.demo.persistance;

import java.util.List;

import com.example.demo.entity.Product;

public interface PersistanceDeclaration {
	
	public List<Product> displayAll();
	
	public Product displayBasedOnId(int id);
	
	public void insertProduct(Product product);
	
	public void updateProduct(Product product); 
	
	public void deleteById(int id);
}
