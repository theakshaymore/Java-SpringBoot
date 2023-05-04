package com.example.demo.persistance;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	@Query("from Student where course_id = ?1")
	public List<Student> findStudentByDeptId(int id);
    
    @Query("from Student where student_name = ?1")
    public List<Student> findStudentByName(String StudentName);
}
