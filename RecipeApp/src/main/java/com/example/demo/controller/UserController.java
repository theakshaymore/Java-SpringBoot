package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Comment;
import com.example.demo.entity.Recipe;
import com.example.demo.entity.User;
import com.example.demo.service.ServiceImplementation;

@RestController
@RequestMapping("/app")
public class UserController {
	
	private ServiceImplementation serviceImplementation;
	

	@Autowired
	public UserController(ServiceImplementation serviceImplementation) {
		super();
		this.serviceImplementation = serviceImplementation;
	}
	
	@GetMapping("user/list")
	public List<User> displayAllUserdata(){
		List<User> users =  serviceImplementation.displayAlldata();
		return users;
	}
	
	@GetMapping("user/list/{id}")
	public User displayById(@PathVariable("id") int id){
		return serviceImplementation.displayById(id);
	}
	
	@GetMapping("user/list/username/{name}")
	public User displayById(@PathVariable("name") String name){
		return serviceImplementation.displayByName(name);
	}
	
	@PostMapping("user/list")
	public void insertUser(@RequestBody User user) {
		serviceImplementation.insertUser(user);
	}
	
	@PutMapping("user/list")
	public void updateUser(@RequestBody User user) {
		serviceImplementation.updateUser(user);
	}
	
	@DeleteMapping("user/list/{id}")
	public void deleteUser(@PathVariable("id") int id) {
		serviceImplementation.deleteUser(id);
	}
	
	
//	-------------------------------------------------------------------------
	//For RECIPE
	@GetMapping("recipe/list") 
	public List<Recipe> getAllRecipes()
	{	
		return serviceImplementation.displayAllRecipeData(); 
	}
	
	@GetMapping("recipe/list/{name}")
	public List<Recipe> getRecipeByName(@PathVariable("name")String name) {
		return serviceImplementation.getByRecipeName(name);
		
	}
	
	@PostMapping("recipe/save") 
	public void insertionRecipe(@RequestBody Recipe rec)
	{
		 serviceImplementation.insertRecipe(rec);
	}
	
	@PutMapping("recipe/save") 
	public void updationRecipe(@RequestBody Recipe rec){
		serviceImplementation.updateRecipeDetails(rec);
	}
	
	@DeleteMapping("recipe/delete/{id}")
	public void deleteRecipeBasedOnId(@PathVariable("id") int id)
	{
	serviceImplementation.deletionRecipe(id);
	}
	
	
//	------------------------------------------------------------------
	//FOR COMMENT
	@GetMapping("comment/list")   
	public List<Comment> getAllComments(){
		List<Comment> comments=serviceImplementation.displayAllComments();
		return comments;
	}
	
	@GetMapping("comment/list/{id}") 
	public Comment displayByCommentId(@PathVariable("id") int id){
		Comment comment=serviceImplementation.displayByCommentId(id);
		if(comment==null)
		{
			throw new RuntimeException("Comment not found with the given id");
		}
		return comment;
	}
	
	@PostMapping("comment/list") 
	public void insertionComment(@RequestBody Comment comment){
		serviceImplementation.insertComment(comment);
	}
	
	@PutMapping("comment/list")
	public void updateCommentDetails(@RequestBody Comment comment){
		serviceImplementation.updateCommentDetails(comment);
	}
	
	@DeleteMapping("comment/list/{id}")
	public void deletionOfComment(@PathVariable("id") int id){
	serviceImplementation.deletionOfComment(id);
	}
}
