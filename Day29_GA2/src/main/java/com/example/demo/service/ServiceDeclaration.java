package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Course;
import com.example.demo.entity.Student;

public interface ServiceDeclaration {
	//FOR STUDENTS
	public List<Student> getAllStudents();
	public List<Student> getStudentsByCourseId(int id);
	public List<Student> getStudentsByStudentName(String name);
	public void addStudent(Student student);
	public void updateStudent(Student student);
	public void deleteStudentByStudentId(int id);

	//FOR COURSE
	public void addCourse(Course course);
	public List<Course> getAllCourses();
	public Course getCourseByCourseId(int cid);
	public Course getCourseByCourseName(String name);
	public void updateCourseByCourseName(String name, Course course);
}
