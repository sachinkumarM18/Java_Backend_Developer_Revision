package com.Exception.Return;

public class ReturnInsideFinallyBlock {
	public static int calculate() {
		try {

			return 20;
		} finally {
			return 100;
		}
	}

	public static void main(String[] args) {
		System.out.println(calculate());
	}
}