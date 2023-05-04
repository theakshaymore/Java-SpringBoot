package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Course;
import com.example.demo.entity.Student;
import com.example.demo.persistance.CourseRepository;
import com.example.demo.persistance.StudentRepository;

@Service
public class ServiceImplementation implements ServiceDeclaration {


	private CourseRepository courseRepository;
	private StudentRepository studentRepository;



	@Autowired
	public ServiceImplementation(CourseRepository courseRepository, StudentRepository studentRepository) {

		this.courseRepository = courseRepository;
		this.studentRepository = studentRepository;
	}




	@Override
	@Transactional
	public List<Student> getAllStudents() {
		List<Student> list = studentRepository.findAll();
		return list;
	}




	@Override
	@Transactional
	public List<Student> getStudentsByCourseId(int id) {
		List<Student> students = studentRepository.findStudentByCourseId(id);
		return students;
	}




	@Override
	@Transactional
	public List<Student> getStudentsByStudentName(String name) {
		List<Student> student = studentRepository.findStudentByStudentName(name);
		return student;
	}




	@Override
	@Transactional
	public void addStudent(Student student) {
		student.setId(0);
		studentRepository.save(student);
	}
	

	@Override
	@Transactional
	public void updateStudent(Student student) {
		studentRepository.save(student);
		
	}
	
	@Override
	@Transactional
	public void deleteStudentByStudentId(int id) {
		studentRepository.deleteById(id);
	}


//----------------------------------------------------------------------


	@Override
	@Transactional
	public void addCourse(Course course) {
		courseRepository.save(course);
	}




	@Override
	public List<Course> getAllCourses() {

		List<Course> courses = courseRepository.findAll();
		return courses;
	}




	@Override
	@Transactional
	public Course getCourseByCourseId(int cid) {
		return courseRepository.findCourseByCourseId(cid);
	}




	@Override
	@Transactional
	public Course getCourseByCourseName(String name) {

		return courseRepository.findCourseByCourseName(name);
	}

	@Override
	@Transactional
	public void updateCourseByCourseName(String name, Course course) {
		Course courseData = courseRepository.findCourseByCourseName(name);
		if(courseData != null) {
			courseRepository.save(course);
		}
	}





}
