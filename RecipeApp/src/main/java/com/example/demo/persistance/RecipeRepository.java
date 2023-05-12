package com.example.demo.persistance;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.example.demo.entity.Recipe;

public interface RecipeRepository extends JpaRepository<Recipe, Integer>{
	@Query("from Recipe where name=?1")
	public List<Recipe> displayingByName(String name);
	
}
