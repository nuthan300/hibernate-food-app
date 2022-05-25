package com.ty.food.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.food.dto.FoodOrder;
import com.ty.food.dto.Item;

public class FoodOrderDao {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager  entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public FoodOrder saveFoodOreder(FoodOrder foodOrder)
	{
		entityTransaction.begin();
		for(Item item : foodOrder.getItems()) {
			entityManager.persist(item);
		}
		entityManager.persist(foodOrder);
		entityTransaction.commit();
		
		return foodOrder;
	}
	
	public FoodOrder getFoodOrderById(int id)
	{
		
		FoodOrder foodOrder=entityManager.find(FoodOrder.class, 1);
		return foodOrder;
	}
}
