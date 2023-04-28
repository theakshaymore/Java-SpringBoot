package com.example.demo.persistance;

import java.util.List;

import javax.persistence.EntityManager;

import javax.persistence.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Student;

@Repository
public class PersistanceImplementationJPA implements PersistanceDeclaration {

	private EntityManager entityManager;

	@Autowired
	public PersistanceImplementationJPA(EntityManager entityManager) {
		this.entityManager = entityManager;
	}


	@Override
	public List<Student> displayAll() {
		Query query=entityManager.createQuery("from Student",Student.class);
		List<Student> students=query.getResultList();
		return students;
	}

	@Override
	public Student displayBasedOnId(int id) 
	{
		Student student=entityManager.find(Student.class, id);
		return student;
	}

	@Override
	public void insertStudent(Student student) 
	{
		entityManager.merge(student);
	}
	@Override
	public void updateStudent(Student student) 
	{
		entityManager.merge(student);	
	}

	@Override
	public void deleteById(int id) 
	{	
		Query query=entityManager.createQuery("delete from Student where id=:studentId");
		query.setParameter("studentId",id);
		query.executeUpdate();
	}

	@Override
	public List<Student> searchByStudentName(String name) 
	{	
		Query query=entityManager.createQuery("from Student where name=:name ",Student.class);
		query.setParameter("name",name);
		List<Student> students=query.getResultList();
		return students;
	}
}
