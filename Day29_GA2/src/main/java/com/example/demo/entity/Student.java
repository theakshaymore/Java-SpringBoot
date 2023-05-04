package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name="Student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name="student_id")
	private int id;

	@Column(name="student_name")
	private String name;

	@Column(name="age")
	private String age;

	@Column(name="course_id")
	private Integer cid;


	@ManyToOne(targetEntity = Course.class,fetch = FetchType.EAGER)
	@JoinColumn(name="course_id",insertable = false,updatable = false)
	private Course course;

	public Student() {

	}

	public Student(int id, String name, String age, Integer cid) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.cid = cid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", cid=" + cid + "]";
	}
	

	

}
