package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.ServiceImplementation;

@RestController
@RequestMapping("/student")
public class StudentController {

	private ServiceImplementation serviceImplementation;
	
	@Autowired
	public StudentController(ServiceImplementation serviceImplementation) {
		this.serviceImplementation = serviceImplementation;
	}
	
	@GetMapping("/list/{CourseId}")
	public List<Student> getStudentById(@PathVariable("CourseId") int id){
		return serviceImplementation.findStudentByDeptId(id);
	}
}
