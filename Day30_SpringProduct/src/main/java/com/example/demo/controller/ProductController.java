package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.Product;
import com.example.demo.service.ServiceImplementation;

@Controller
@RequestMapping("products")
public class ProductController {
	
	private ServiceImplementation serviceImplementation;
	
	@Autowired
	public ProductController(ServiceImplementation serviceImplementation) {
		this.serviceImplementation = serviceImplementation;
	}
	
	@GetMapping("list")
	public String getAllProducts(Model model)
	{
		List<Product> products=serviceImplementation.displayAlldata();
		model.addAttribute("PRODUCT", products);
		return "products/productList";
	}

	@GetMapping("list/delete")
	public String deleteProduct(@RequestParam("productId") int id)
	{
		serviceImplementation.deleteById(id);;
		return "redirect:/products/list";
	}
	
	@GetMapping("list/product")
	public String searchProductByProductId(@RequestParam("searchName") String searchName, Model model) {
		List<Product> product = serviceImplementation.searchProductByProductId(searchName);
		model.addAttribute("PRODUCT", product);
		return "products/productList";	
	}
	
}
