package com.ty.food.controller;

import com.ty.food.dto.Menu;
import com.ty.food.service.MenuService;

public class UpdateMenu {

	public static void main(String[] args) {

		MenuService menuService = new MenuService();

		Menu menu = new Menu();
		menu.setName("chicken");
		menuService.updateMenu(5,menu);

	}
}
