package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee02;
import com.example.demo.persistance.DepartmentRepository;
import com.example.demo.persistance.EmployeeRepository;

@Service
public class ServiceImplementation implements ServiceDeclaration{

	private EmployeeRepository employeeRepository;
	private DepartmentRepository departmentRepository;
	
	@Autowired
	public ServiceImplementation(EmployeeRepository employeeRepository, DepartmentRepository departmentRepository) {
		this.employeeRepository = employeeRepository;
		this.departmentRepository = departmentRepository;
	}

	@Override
	@Transactional
	public List<Employee02> findEmployeeById(int id) {
		List<Employee02> employees = findEmployeeById(id);
		return employees;
	}
	
	
}
