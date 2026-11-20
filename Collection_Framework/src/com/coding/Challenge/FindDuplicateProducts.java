package com.coding.Challenge;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateProducts {
	public static void main(String[] args) {
		List<String> products = new ArrayList<String>();
		products.add("Laptop");
		products.add("Mouse");
		products.add("Keyboard");
		products.add("Mobile");
		products.add("Monitor");
		products.add("Mouse");
		products.add("Keyboard");
		products.add("Monitor");

		System.out.println(products);

		Set<String> uniqueProducts = new HashSet<String>(products);
		System.out.println(uniqueProducts);
		System.out.println("Total Unique Product Count : " + uniqueProducts.size());
	}
}
