package com.ty.food.controller;

import java.util.ArrayList;
import java.util.List;

import com.ty.food.dto.FoodOrder;
import com.ty.food.dto.Item;
import com.ty.food.service.FoodOrderService;

public class TestSaveFoodOrder {

	public static void main(String[] args) {
		
		FoodOrderService foodOrderService=new FoodOrderService();
		
		FoodOrder foodOrder=new FoodOrder();
		foodOrder.setName("ravi");
		foodOrder.setPhone(4433225566l);
		
		Item item1=new Item();
		item1.setName("Fizza");
		item1.setQauntity(6);
		item1.setCost(150);
		
		Item item2=new Item();
		item2.setName("Burger");
		item2.setQauntity(4);
		item2.setCost(100);
		
		Item item3=new Item();
		item3.setName("Pepsi");
		item3.setQauntity(2);
		item3.setCost(150);
		
		item1.setFoodOrder(foodOrder);
		item2.setFoodOrder(foodOrder);
		item3.setFoodOrder(foodOrder);
		
		List<Item> items=new ArrayList<Item>();
		items.add(item1);
		items.add(item2);
		items.add(item3);
		
		foodOrder.setItems(items);
		
		foodOrderService.saveFoodOrder(foodOrder);
	}
}
