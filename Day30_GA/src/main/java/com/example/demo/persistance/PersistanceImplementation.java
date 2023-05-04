package com.example.demo.persistance;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Product;

@Repository
public class PersistanceImplementation implements PersistanceDeclaration {

	private EntityManager entityManager;

	@Autowired
	public PersistanceImplementation(EntityManager entityManager) {
		this.entityManager = entityManager;
	}


	@Override
	public List<Product> displayAll() {

		Session session = entityManager.unwrap(Session.class);
		Query<Product> query = session.createQuery("from Product", Product.class);
		List<Product> products = query.getResultList();
		return products;
	}

	@Override
	public Product displayBasedOnId(int id) {
		Session session = entityManager.unwrap(Session.class);
		Product product = session.find(Product.class,id);
		return product;
	}

	@Override
	public void insertProduct(Product product) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(product);
	}

	@Override
	public void updateProduct(Product product) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(product);
	}


	@Override
	public void deleteById(int id) {
		Session session = entityManager.unwrap(Session.class);
		Product product = session.find(Product.class, id);
		if (product != null) {
			session.delete(product);
		}
	}


}
