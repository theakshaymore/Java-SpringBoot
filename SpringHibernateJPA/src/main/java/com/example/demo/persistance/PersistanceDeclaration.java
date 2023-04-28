package com.example.demo.persistance;

import java.util.List;

import com.example.demo.entity.Student;

public interface PersistanceDeclaration {
	
	public List<Student> displayAll();
	
	public Student displayBasedOnId(int id);
	
	public void insertStudent(Student student);
	
	public void updateStudent(Student student); 
	
	public void deleteById(int id);

	public List<Student> searchByStudentName(String name);
}
