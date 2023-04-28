package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.persistance.PersistanceDeclaration;
import com.example.demo.persistance.PersistanceImplementation;

@Service
public class ServiceImplementation implements ServiceDeclaration {
	
	private PersistanceDeclaration persistanceImplementation;
	
	@Autowired
	public ServiceImplementation(@Qualifier("persistanceImplementationJPA") PersistanceDeclaration persistanceImplementation) {
		super();
		this.persistanceImplementation = persistanceImplementation;
	}
	
	@Override
	@Transactional
	public List<Student> displayAlldata() {
		return persistanceImplementation.displayAll();
	}

	@Override
	@Transactional
	public Student displayById(int id) {
		return persistanceImplementation.displayBasedOnId(id);
	}

	@Override
	@Transactional
	public void insertStudent(Student student) {
		persistanceImplementation.insertStudent(student);
	}

	@Override
	@Transactional
	public void updateStudentDetails(Student student) {
		persistanceImplementation.updateStudent(student);
	}

	@Override
	@Transactional
	public void deleteById(int id) {
		persistanceImplementation.deleteById(id);
		
	}

}
