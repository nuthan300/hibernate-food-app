package com.ty.food.controller;

import com.ty.food.dto.FoodOrder;
import com.ty.food.dto.Item;
import com.ty.food.service.FoodOrderService;

public class TestFoodOrderByPhone {

	public static void main(String[] args) {

		FoodOrderService foodOrderService = new FoodOrderService();

		FoodOrder foodOrder = foodOrderService.getFoodOrderByPhone(4433225566l);

		System.out.println("\n"+foodOrder.getName()+"\n");
		Item.i  = 1; 
		System.out.println("Id\tItem\tQuantity   MRP\t\tCost");
		System.out.println("----------------------------------------------------------------");
		System.out.println(foodOrder.getItems());

	}
}
