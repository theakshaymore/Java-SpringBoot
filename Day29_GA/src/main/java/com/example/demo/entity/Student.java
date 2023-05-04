package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "Student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "student_id")
	private int studentId;
	
	@Column(name = "student_name")
	private String studentName;
	
	@Column(name = "age")
	private int age;
	
	@Column(name = "course_id")
	private Integer courseId;
	
	@ManyToOne(targetEntity = Course.class, fetch = FetchType.EAGER)
	@JoinColumn(name = "course_id", insertable = false, updatable = false)
	private Course course;

	public Student() {
	}

	public Student(int studentId, String studentName, int age, Integer courseId, Course course) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.age = age;
		this.courseId = courseId;
		this.course = course;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", age=" + age + ", courseId="
				+ courseId + ", course=" + course + "]";
	}

	
	
}
