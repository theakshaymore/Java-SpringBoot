package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Comment;
import com.example.demo.entity.Recipe;
import com.example.demo.entity.User;

public interface ServiceDeclaration {
	
	public List<User> displayAlldata();
	
	public User displayById(int id);
	public User displayByName(String name);
	
	public void insertUser(User user);
	
	public void updateUser(User user);
	
	public void deleteUser(int id);
	
	//FOR RECIPE
	public List<Recipe> displayAllRecipeData();
	public List<Recipe> getByRecipeName(String name);
	public void insertRecipe(Recipe rec);
	public void updateRecipeDetails(Recipe rec); 
    public void deletionRecipe(int id);
    
    //FOR COMMENT
    public List<Comment> displayAllComments(); 
	public Comment displayByCommentId(int id); 
	public void insertComment(Comment com); 
	public void updateCommentDetails(Comment com); 
    public void deletionOfComment(int id);
}
