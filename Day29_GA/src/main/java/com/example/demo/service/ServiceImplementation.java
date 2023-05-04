package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.entity.Student;
import com.example.demo.persistance.CourseRepository;
import com.example.demo.persistance.StudentRepository;

@Service
public class ServiceImplementation implements ServiceDeclaration{

	private StudentRepository studentRepository;
	private CourseRepository courseRepository;
	
	@Autowired
	public ServiceImplementation(StudentRepository studentRepository, CourseRepository courseRepository) {
		this.studentRepository = studentRepository;
		this.courseRepository = courseRepository;
	}

	@Override
	@Transactional
	public List<Student> findStudentByDeptId(int id) {
		List<Student> student=studentRepository.findStudentByDeptId(id);
		return student;
	}

	@Override
	@Transactional
	public List<Student> findStudentByName(String StudentName) {
		return studentRepository.findStudentByName(StudentName);
	}
	
	
}
