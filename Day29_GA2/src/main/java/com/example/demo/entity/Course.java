package com.example.demo.entity;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="Course")
public class Course {

	@Id
	@Column(name="course_id")
	private int id;
	@Column(name="course_name")
	private String cname;

	@Column(name="fees")
	private int fees;

	@OneToMany(mappedBy = "course")

	private Set<Student> student;


	public Course() {

	}

	public Course(int id, String cname, int fees) {
		super();
		this.id = id;
		this.cname = cname;
		this.fees = fees;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCname() {
		return cname;
	}


	public void setCname(String cname) {
		this.cname = cname;
	}


	public int getFees() {
		return fees;
	}


	public void setFees(int fees) {
		this.fees = fees;
	}


	@Override
	public String toString() {
		return "Course [id=" + id + ", cname=" + cname + ", fees=" + fees + "]";
	}





}
