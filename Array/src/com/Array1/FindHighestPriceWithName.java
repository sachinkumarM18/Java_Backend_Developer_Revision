package com.Array1;

import java.util.*;

public class FindHighestPriceWithName {

	public static void main(String[] args) {
		// i have creatded players and their price.
		String players[];
		players = new String[5];
		players[0] = "Virat";
		players[1] = "Devilliers";
		players[2] = "Ben Stokes";
		players[3] = "Tim David";
		players[4] = "Hardik";

		int[] prices = { 15, 18, 21, 12, 14 };
//FInd the Name from the Given Data
		Scanner sc = new Scanner(System.in);
		int maxPriceIndex = 0;

		for (int i = 1; i < prices.length; i++) {
			if (prices[i] > prices[maxPriceIndex]) {
				maxPriceIndex = i;
			}
		}

		System.out.println("The Players with highest price is : " + players[maxPriceIndex] + " with a price of Rs. "
				+ prices[maxPriceIndex]);
	}
}