package com.example.demo.persistance;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Employee02;

public interface EmployeeRepository extends JpaRepository<Employee02, Integer> {
	
	@Query("from Employee02 where deptId = ?1")
	public List<Employee02> findEmployeeById(int id);
}
