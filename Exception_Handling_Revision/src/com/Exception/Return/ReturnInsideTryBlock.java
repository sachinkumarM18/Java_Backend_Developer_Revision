package com.Exception.Return;

public class ReturnInsideTryBlock {
	public static int calculate() {
		try {
			return 10;
		} finally {
			System.out.println("Printing Final Value");
		}
	}

	public static void main(String[] args) {
		System.out.println(calculate());
	}
}