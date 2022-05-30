package com.ty.food.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.food.dto.User;

public class UserDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public boolean saveUser(User user) {
		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
		return true;
	}

	public User getUserById(int id) {
		User user = entityManager.find(User.class, id);
		return user;
	}

	public boolean deleteUserbyId(int id) {
		User user = entityManager.find(User.class, id);
		entityTransaction.begin();
		entityManager.remove(user);
		entityTransaction.commit();
		return true;

	}

	public User validateUser(String email, String password) {
		Query query = entityManager.createQuery("SELECT u FROM User u WHERE u.email=?1 AND u.password=?2");
		query.setParameter(1, email);
		query.setParameter(2, password);
		User user = null;
		try {
			user = (User) query.getSingleResult();
		} catch (NoResultException e) {
			e.printStackTrace();
		}
		return user;
	}

	@SuppressWarnings("unchecked")
	public List<User> getAllUser() {
		Query query = entityManager.createQuery("SELECT u FROM User u");
		return query.getResultList();
	}
}
