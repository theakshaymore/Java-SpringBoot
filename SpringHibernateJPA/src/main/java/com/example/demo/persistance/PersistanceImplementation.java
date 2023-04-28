package com.example.demo.persistance;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Student;

@Repository
public class PersistanceImplementation implements PersistanceDeclaration {

	private EntityManager entityManager;

	@Autowired
	public PersistanceImplementation(EntityManager entityManager) {
		this.entityManager = entityManager;
	}


	@Override
	public List<Student> displayAll() {

		Session session = entityManager.unwrap(Session.class);
		Query<Student> query = session.createQuery("from Student03", Student.class);
		List<Student> students = query.getResultList();
		return students;
	}

	@Override
	public Student displayBasedOnId(int id) {
		Session session = entityManager.unwrap(Session.class);
		Student student = session.find(Student.class,id);
		return student;
	}

	@Override
	public void insertStudent(Student student) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(student);
	}

	@Override
	public void updateStudent(Student student) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(student);
	}


	@Override
	public void deleteById(int id) {
		Session session = entityManager.unwrap(Session.class);
		Student student = session.find(Student.class, id);
		if (student != null) {
			session.delete(student);
		}
	}


	@Override
	public List<Student> searchByStudentName(String name) {
		Session session=entityManager.unwrap(Session.class);	
		Query<Student> query=session.createQuery("from Student03 where first_name=:name ",Student.class);
		query.setParameter("name",name);
		List<Student> student=query.getResultList();
		return student;
	}


}
