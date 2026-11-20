package com.coding.Challenge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class ShortProductPrice {
	private String productName;
	private int price;

	public ShortProductPrice(String productName, int price) {
		super();
		this.productName = productName;
		this.price = price;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ShortProductPrice [productName=" + productName + ", price=" + price + "]";
	}

	public static void main(String[] args) {
		List<ShortProductPrice> products = new ArrayList<ShortProductPrice>();
		products.add(new ShortProductPrice("Pizza", 1009));
		products.add(new ShortProductPrice("Biryani", 1360));
		products.add(new ShortProductPrice("Coldrinks", 200));
		products.add(new ShortProductPrice("Momos", 90));

//		products.sort(Comparator.comparingInt(p -> p.price));
//		System.out.println("Price Low to High : " + products);
//
//		products.sort(Comparator.comparingInt((ShortProductPrice p) -> p.price).reversed());
//		System.out.println("Price High to Low : " + products);

		// Highest Price of Product
		ShortProductPrice highestPrice = products.stream().max(Comparator.comparingInt(p -> p.price)).orElse(null);
		//System.out.println("Highest Price of Product is : " + highestPrice);

		// Lowest Price of Product
		ShortProductPrice lowestPrice = products.stream().min(Comparator.comparingInt(ShortProductPrice::getPrice))
				.orElse(null);
		//System.out.println("Lowest Price of Product is : " + lowestPrice);

		// Show Product Price range of 120
//		products.stream().filter(p -> p.price >= 1000)
//				.forEach(p -> System.out.println(p.getProductName() + " : " + p.getPrice()));
		
		
	}

}
