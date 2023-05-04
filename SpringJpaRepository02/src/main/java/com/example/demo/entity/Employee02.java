package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "Employee02")
public class Employee02 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "deptId")
	private Integer deptId;

	@ManyToOne(targetEntity = Department02.class, fetch = FetchType.EAGER)
	@JoinColumn(name = "deptId", insertable = false, updatable = false)
	private Department02 department02;
	public Employee02() {
		
	}

	public Employee02(int id, String firstName, String lastName, String email, Integer deptId) {
	
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.deptId = deptId;
	}

	@Override
	public String toString() {
		return "Employee02 [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", deptId=" + deptId + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
	
}
