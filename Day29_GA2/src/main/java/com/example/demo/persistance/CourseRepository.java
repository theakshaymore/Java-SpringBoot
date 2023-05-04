package com.example.demo.persistance;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Course;


public interface CourseRepository extends JpaRepository<Course, Integer> {

	

	@Query("from Course where course_id=?1")
	public Course findCourseByCourseId(int id);
	
	
	@Query("from Course where course_name=?1")
	public Course findCourseByCourseName(String name);
	
}
