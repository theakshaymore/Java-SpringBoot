package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee02;
import com.example.demo.service.ServiceImplementation;

@RestController
@RequestMapping("employees")
public class EmployeeController {

	private ServiceImplementation serviceImplementation;
	
	@Autowired
	public EmployeeController(ServiceImplementation serviceImplementation) {
		this.serviceImplementation = serviceImplementation;
	}
	
	@GetMapping("/list/{deptId}")
	public List<Employee02> getEmployeeById(@PathVariable("deptId") int id){
		return serviceImplementation.findEmployeeById(id);
	}
}
