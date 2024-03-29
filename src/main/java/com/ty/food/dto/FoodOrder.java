package com.ty.food.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class FoodOrder {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private long phone;
	private int total;

	@OneToMany(mappedBy = "foodOrder")
	List<Item> items;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public int getTotal() {
		return total;
	}

	public void setTotale(int total) {
		this.total = total;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		System.out.println();
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
		System.out.println("Phone : " + phone);
		System.out.println("Total : " + total);
		System.out.println("--------------------");
		System.out.println();
		return "";
	}

}
