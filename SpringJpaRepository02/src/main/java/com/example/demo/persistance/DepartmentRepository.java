package com.example.demo.persistance;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Department02;

public interface DepartmentRepository extends JpaRepository<Department02, Integer> {

}
