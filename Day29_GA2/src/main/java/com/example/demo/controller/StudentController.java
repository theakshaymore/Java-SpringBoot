package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Course;
import com.example.demo.entity.Student;
import com.example.demo.service.ServiceImplementation;

@RestController
@RequestMapping("/student")
public class StudentController {

	private ServiceImplementation serviceImplementation;

	@Autowired
	public StudentController(ServiceImplementation serviceImplementation) {
		super();
		this.serviceImplementation = serviceImplementation;
	}
	
	//FOR STUDENTS
	@GetMapping("list/students")
	public List<Student> getAllStudents(){
		return serviceImplementation.getAllStudents();
	}
	
	@GetMapping("list/student/{id}")
	public List<Student> getStudentsByCourseId(@PathVariable("id") int id){
		return serviceImplementation.getStudentsByCourseId(id);
	}
	
	@GetMapping("list1/student/{name}")
	public List<Student> getStudentsByStudentName(@PathVariable("name") String name){
		return serviceImplementation.getStudentsByStudentName(name);
	}
	
	@PostMapping("add/student")
	public void addStudent(@RequestBody Student student) {
		
		serviceImplementation.addStudent(student);
	}
	
	@PutMapping("update/student")
	public void updateStudent(@RequestBody Student student) {
		serviceImplementation.updateStudent(student);
	}
	
	@DeleteMapping("delete/student/{id}")
	public void deleteStudentByStudentId(@PathVariable("id") int id) {
		serviceImplementation.deleteStudentByStudentId(id);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	//FOR COURSE
	@PostMapping("add/course")
	public void addCourse(@RequestBody Course course) {
		serviceImplementation.addCourse(course);
	}
	
	@GetMapping("list/course")
	public List<Course> getAllCourses(){
		return serviceImplementation.getAllCourses();
	}
	
	@GetMapping("list/course/{id}")
	public Course getCourseByCourseId(@PathVariable("id") int id) {
		return serviceImplementation.getCourseByCourseId(id);
	}
	
	@GetMapping("list1/course/{name}")
	public Course getCourseByCourseName(@PathVariable("name") String name) {
		return serviceImplementation.getCourseByCourseName(name);
	}
	
	@PutMapping("update/course/{name}")
	public void updateCourseByCourseName(@PathVariable("name") String name, @RequestBody Course course) {
		serviceImplementation.updateCourseByCourseName(name, course);
	}
	
}
