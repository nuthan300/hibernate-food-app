package com.ty.food.service;

import com.ty.food.dao.FoodOrderDao;
import com.ty.food.dto.FoodOrder;

public class FoodOrderService {

	FoodOrderDao  dao=new FoodOrderDao();
	public FoodOrder saveFoodOrder(FoodOrder foodOrder)
	{
		return dao.saveFoodOreder(foodOrder);
	}
	public FoodOrder getFoodOrderById(int id)
	{
		return dao.getFoodOrderById(id);
	}
}
