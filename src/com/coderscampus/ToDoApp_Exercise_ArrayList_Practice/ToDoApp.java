package com.coderscampus.ToDoApp_Exercise_ArrayList_Practice;

import java.util.ArrayList;
import java.util.List;

public class ToDoApp {

	public static void main(String[] args) {

		List<String> chores = new ArrayList<String>();

		addItem(chores, "Wash Dishes");
		addItem(chores, "Fold Laundry");
		addItem(chores, "Code For an Hour");
		displayItem(chores);
		deleteItem(chores, "Wash Dishes");
		displayItem(chores);
		updateItem(chores, "Code All Day", 1);
		displayItem(chores);
	}

	private static void addItem(List<String> chores, String item) {
		chores.add(item);
	}

	private static void displayItem(List<String> chores) {
		for (String chore : chores) {
			System.out.println(chore);
		}
		System.out.println("");
	}

	private static void updateItem(List<String> chores, String item, int num) {
		chores.indexOf(item);
		chores.set(num, item);
	}

	private static void deleteItem(List<String> chores, String item) {
		chores.remove(item);
	}

}
