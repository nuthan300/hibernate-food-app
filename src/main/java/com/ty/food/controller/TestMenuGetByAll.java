package com.ty.food.controller;

import com.ty.food.service.MenuService;

public class TestMenuGetByAll {

	public static void main(String[] args) {
		MenuService menuService = new MenuService();
		
		System.out.println(menuService.getAllMenu());
		
	}
}
