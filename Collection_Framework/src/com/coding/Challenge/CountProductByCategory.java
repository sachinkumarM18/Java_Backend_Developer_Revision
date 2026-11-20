package com.coding.Challenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountProductByCategory {

	public static void main(String[] args) {
		List<String> categories = new ArrayList<String>();
		categories.add("Electronics");
		categories.add("Fashion");
		categories.add("Home & Kitchen");
		categories.add("Books");
		categories.add("Sports & Fitness");
		categories.add("Beauty & Personal Care");
		categories.add("Groceries");
		categories.add("Electronics"); // Duplicate for testing
		categories.add("Books");

		HashMap<String, Integer> categoryCount = new HashMap<>();

		for (String category : categories) {
			categoryCount.put(category, categoryCount.getOrDefault(category, 0) + 1);
		}

		for (Map.Entry<String, Integer> entry : categoryCount.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

}
