package com.coding.Challenge;

import java.util.ArrayList;
import java.util.List;

public class DisplayProduct {

	public static void main(String[] args) {
		List<String> products = new ArrayList<>();
		products.add("Mango");
		products.add("Banana");
		products.add("Grapes");
		products.add("Orange");

		// System.out.println(products);
		for (String string : products) {
			System.out.println(string);
		}
		
		System.out.println("Total No of Products : " + products.size());
	}

}
