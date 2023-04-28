package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Student;

public interface ServiceDeclaration {
	
	public List<Student> displayAlldata();
	
	public Student displayById(int id);
	
	public void insertStudent(Student product);
	
	public void updateStudentDetails(Student product);
	
	public void deleteById(int id);
}
