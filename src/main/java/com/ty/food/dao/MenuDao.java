package com.ty.food.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.food.dto.Menu;

public class MenuDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public boolean saveMenu(Menu menu) {
		if (menu == null) {
			return false;
		}
		entityTransaction.begin();
		entityManager.persist(menu);
		entityTransaction.commit();
		return true;
	}

	public boolean updateMenu(int id, Menu menu) {
		Menu menu2 = entityManager.find(Menu.class, id);
		if (menu2 != null) {
			entityTransaction.begin();
			menu2.setId(id);
			entityManager.merge(menu2);
			entityTransaction.commit();
			return true;
		}
		return false;
	}

	public Menu getMenuById(int id) {
		Menu menu = entityManager.find(Menu.class, id);

		if (menu != null) {
			return menu;
		}
		return null;

	}

	@SuppressWarnings("unchecked")
	public List<Menu> getAllMenu() {

		Query query = entityManager.createQuery("select m From Menu m");
		return query.getResultList();

	}

	public boolean deleteMenuById(int id) {

		Menu menu = entityManager.find(Menu.class, id);
		if (menu != null) {
			entityTransaction.begin();
			entityManager.remove(menu);
			entityTransaction.commit();
			return true;

		}
		return false;
	}
}
