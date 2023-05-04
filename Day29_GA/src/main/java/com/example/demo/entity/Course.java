package com.example.demo.entity;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "Course")
public class Course {
	
	@Id
	@Column(name = "cid")
	private Integer cid;
	
	@Column(name = "course_name")
	private String courseName;
	
	@Column(name = "fees")
	private int fees;

	@Override
	public String toString() {
		return "Course [courseId=" + cid + ", courseName=" + courseName + ", fees=" + fees + ", students="
				+ students + "]";
	}
	public Integer getCourseId() {
		return cid;
	}
	public void setCourseId(Integer courseId) {
		this.cid = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public Set<Student> getStudents() {
		return students;
	}
	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	public Course(Integer courseId, String courseName, int fees, Set<Student> students) {
		super();
		this.cid = courseId;
		this.courseName = courseName;
		this.fees = fees;
		this.students = students;
	}
	@OneToMany(mappedBy = "course")
	private Set<Student> students;
	public Course() {
		
	}
	
}
