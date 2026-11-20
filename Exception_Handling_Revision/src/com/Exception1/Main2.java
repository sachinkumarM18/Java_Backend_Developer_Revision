package com.Exception1;

public class Main2 {
	public static void main(String[] args) {

		try {
			int[] arr = { 10, 20, 30 };
			System.out.println(arr[5]);
		} catch (NullPointerException e) {
			System.out.println("Array Index OutOfBound Found");
		}
	}
}
