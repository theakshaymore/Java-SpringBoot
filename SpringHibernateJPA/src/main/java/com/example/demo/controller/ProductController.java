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



import com.example.demo.entity.Student;
import com.example.demo.service.ServiceImplementation;

@RestController
@RequestMapping("student")
public class ProductController {

	private ServiceImplementation serviceImplementation;

	@Autowired
	public ProductController(ServiceImplementation serviceImplementation) {
		this.serviceImplementation = serviceImplementation;
	}

	@GetMapping("list")
	public List<Student> getAllProducts(){
		List<Student> students=serviceImplementation.displayAlldata();
		return students;
	}

	@GetMapping("list/{studentId}")
	public Student getStudent(@PathVariable("studentId") int id){
		Student student=serviceImplementation.displayById(id);
		if(student==null)
		{
			throw new RuntimeException("Student not found with the given id");
		}
		return student;
	}


	@PostMapping("list") 
	public void insertionStudent(@RequestBody Student student){
		student.setId(0);
		serviceImplementation.insertStudent(student);
	}


	@PutMapping("list")
	public void updationProduct(@RequestBody Student student){
		serviceImplementation.updateStudentDetails(student);
	}
	
	@DeleteMapping("list/{studentId}")
	public void deleteStudent(@PathVariable("studentId") int id){
		serviceImplementation.deleteById(id);;

	}

}
