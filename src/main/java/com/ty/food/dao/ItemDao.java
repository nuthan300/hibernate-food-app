package com.ty.food.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.food.dto.Item;

public class ItemDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	public boolean saveItem(Item item) {
	
		entityTransaction.begin();
		entityManager.persist(item);
		entityTransaction.commit();
		return true;
	}

	public Item getItemById(int id) {
		
		return entityManager.find(Item.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Item> getAllItem() {
		
		Query query = entityManager.createQuery("Select i from Item i");
		return query.getResultList();
	}

	public boolean updateItem(Item item) {

		entityTransaction.begin();
		entityManager.merge(item);
		entityTransaction.commit();
		return true;
	}

	public boolean deleteItem(int id) {

		Item item = entityManager.find(Item.class, 1);
		if (item != null) {
			entityTransaction.begin();
			entityManager.remove(item);
			entityTransaction.commit();
			return true;
		}
		return false;
	}
}
