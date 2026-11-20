package com.coding.Challenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale.Category;
import java.util.Map;
import java.util.stream.Collectors;

public class FindGroupByProductCategory {

	String name;
	String category;
	double price;

	FindGroupByProductCategory(String name, String category, double price) {
		this.name = name;
		this.category = category;
		this.price = price;
	}

	@Override
	public String toString() {
		return name + " (₹" + price + ")";
	}

	public static void main(String[] args) {
		List<FindGroupByProductCategory> products = new ArrayList<>();
		products.add(new FindGroupByProductCategory("Laptop", "Electronics", 55000));
		products.add(new FindGroupByProductCategory("Mouse", "Accessories", 500));
		products.add(new FindGroupByProductCategory("Keyboard", "Accessories", 1500));
		products.add(new FindGroupByProductCategory("Monitor", "Electronics", 12000));

		// Group product By Category
		Map<String, List<FindGroupByProductCategory>> groupByCategory = products.stream()
				.collect(Collectors.groupingBy(p -> p.category));
		System.out.println(groupByCategory);

		// Printing each group cleanly
		groupByCategory.forEach((category, productList) -> System.out.println(category + "-> " + productList));

	}

}
