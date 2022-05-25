package com.ty.food.controller;

import com.ty.food.dto.FoodOrder;
import com.ty.food.service.FoodOrderService;

public class TestFoodOrderGetById {

	public static void main(String[] args) {

		FoodOrderService foodOrderService = new FoodOrderService();

		FoodOrder foodOrder = foodOrderService.getFoodOrderById(1);

		System.out.println(foodOrder);
		System.out.println(foodOrder.getItems());

	}
}
