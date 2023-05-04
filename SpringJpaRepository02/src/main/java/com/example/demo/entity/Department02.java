package com.example.demo.entity;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "Department02")
public class Department02 {
	
	@Id
	@Column(name = "deptId")
	private int deptId;
	
	@Column(name = "deptName")
	private String name;
	
	@OneToMany(mappedBy = "department02")
	private Set<Employee02> employee02;
	
	public Department02() {
		
	}

	public Department02(int deptId, String name) {
		
		this.deptId = deptId;
		this.name = name;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Department02 [deptId=" + deptId + ", name=" + name + "]";
	}
	
}
