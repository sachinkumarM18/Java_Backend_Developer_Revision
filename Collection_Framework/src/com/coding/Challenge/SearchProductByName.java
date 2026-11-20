package com.coding.Challenge;

import java.util.ArrayList;
import java.util.List;

public class SearchProductByName {

	public static void main(String[] args) {

		List<String> products = new ArrayList<String>();
		products.add("Laptop");
		products.add("Mouse");
		products.add("Keyboard");
		products.add("Mobile");
		products.add("Monitor");

		int index = products.indexOf("Mouse");

		// Search by Product Name
//		if(products.contains("Mouse")) {
//			System.out.println("Product Found");
//		}else {
//			System.out.println("Product Not Found");
//		}

		// Update the Product Name
		if (index != -1) {
			products.set(index, "Wireless Mouse");
		}

		for (String string : products) {
			System.out.println(string);
		}
		System.out.println("\n");
		System.out.println("Total Products Available : " + products.size());
	}

}
