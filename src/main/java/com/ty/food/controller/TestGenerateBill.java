package com.ty.food.controller;

import com.ty.food.dto.FoodOrder;
import com.ty.food.service.FoodOrderService;

public class TestGenerateBill {

	public static void main(String[] args) {
		FoodOrderService foodOrderService = new FoodOrderService();

		int id = 1;

		FoodOrder foodOrder = foodOrderService.getFoodOrderById(id);

		System.out.println("------------ Bill ------------");
		System.out.println("Items: ");
		System.out.println("Id\tItem\tQuantity   MRP\t\tCost");
		System.out.println("----------------------------------------------------------------");
		System.out.println(foodOrder.getItems());

		double total = foodOrder.getTotal();
		System.out.println("Total: " + total);
		System.out.println("CGST: " + foodOrderService.getCgst(total));
		System.out.println("SGST: " + foodOrderService.getSgst(total));
		System.out.println("\t\t Total Cost: " + foodOrderService.billGenerated(total));
	}
}
