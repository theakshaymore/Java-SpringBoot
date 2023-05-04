package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Student;

public interface ServiceDeclaration {

	public List<Student> findStudentByDeptId(int id);


	public List<Student> findStudentByName(String StudentName);
}
