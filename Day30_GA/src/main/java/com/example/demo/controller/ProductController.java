package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



import com.example.demo.entity.Product;
import com.example.demo.service.ServiceImplementation;

@RestController
@RequestMapping("products")
public class ProductController {
	
	private ServiceImplementation serviceImplementation;
	
	@Autowired
	public ProductController(ServiceImplementation serviceImplementation) {
		this.serviceImplementation = serviceImplementation;
	}
	
	@GetMapping("list")
	public List<Product> getAllProducts()
	{
		List<Product> products=serviceImplementation.displayAlldata();
		return products;
	}
	
	@GetMapping("list/{productId}")
	public Product getProduct(@PathVariable("productId") int id)
	{
		Product product=serviceImplementation.displayById(id);
		if(product==null)
		{
			throw new RuntimeException("Product not found with the given id");
		}
	return product;
	}
	
	
	@PostMapping("list") 
	public void insertionProduct(@RequestBody Product product)
	{
		product.setId(0);
		serviceImplementation.insertProduct(product);
	}
	
	
	@PutMapping("list")
	public void updationProduct(@RequestBody Product product)
	{
		serviceImplementation.updateProductDetails(product);
	}
	
	@DeleteMapping("list/{productId}")
	public void deleteProduct(@PathVariable("productId") int id)
	{
		serviceImplementation.deleteById(id);;
		
	}
	
}
