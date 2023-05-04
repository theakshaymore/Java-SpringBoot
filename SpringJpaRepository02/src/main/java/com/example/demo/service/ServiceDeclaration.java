package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Employee02;

public interface ServiceDeclaration {
	
	public List<Employee02> findEmployeeById(int id);
}
