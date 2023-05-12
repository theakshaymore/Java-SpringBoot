package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Comment;
import com.example.demo.entity.Recipe;
import com.example.demo.entity.User;
import com.example.demo.persistance.CommentRepository;
import com.example.demo.persistance.RecipeRepository;
import com.example.demo.persistance.UserRepository;

@Service
public class ServiceImplementation implements ServiceDeclaration {

	private UserRepository userRepository;
	private RecipeRepository recipeRepository;
	private CommentRepository commentRepository;

	
	@Autowired
	public ServiceImplementation(UserRepository userRepository, RecipeRepository recipeRepository,
			CommentRepository commentRepository) {
		this.userRepository = userRepository;
		this.recipeRepository = recipeRepository;
		this.commentRepository = commentRepository;
	}
	
	
	//FOR USER	
	@Override
	@Transactional
	public List<User> displayAlldata() {
		List<User> list = userRepository.findAll();
		return list;
	}

	@Override
	@Transactional
	public User displayById(int id) {
		return userRepository.findById(id).get();
	}
	
	@Override
	@Transactional
	public User displayByName(String name) {
		return userRepository.findByUserName(name);
	}
	
	@Override
	@Transactional
	public void insertUser(User user) {
		//TODO: Password encryption remaining
		user.getPassword();
		userRepository.save(user);
	}

	@Override
	@Transactional
	public void updateUser(User user) {
		userRepository.save(user);
	}

	@Override
	@Transactional
	public void deleteUser(int id) {
		userRepository.deleteById(id);
	}

	
//	--------------------------------------------------------------------------------------
	//FOR RECIPE
	@Override
	@Transactional
	public List<Recipe> displayAllRecipeData() {
		return recipeRepository.findAll();
	}


	@Override
	@Transactional
	public List<Recipe> getByRecipeName(String name) {
		return recipeRepository.displayingByName(name);
	}


	@Override
	@Transactional
	public void insertRecipe(Recipe rec) {
		recipeRepository.save(rec);	
	}


	@Override
	@Transactional
	public void updateRecipeDetails(Recipe rec) {
		recipeRepository.save(rec);
	}


	@Override
	@Transactional
	public void deletionRecipe(int id) {
		recipeRepository.deleteById(id);
	}

//	-------------------------------------------------------------------------------
	//FOR COMMENT
	@Override
	@Transactional
	public List<Comment> displayAllComments() {
		return commentRepository.findAll();
	}


	@Override
	@Transactional
	public Comment displayByCommentId(int id) {
		return commentRepository.findById(id).get();
	}


	@Override
	@Transactional
	public void insertComment(Comment com) {
		commentRepository.save(com);
	}


	@Override
	@Transactional
	public void updateCommentDetails(Comment com) {
		commentRepository.save(com);	
	}


	@Override
	@Transactional
	public void deletionOfComment(int id) {
		commentRepository.deleteById(id);
	}
	
	
	

}
