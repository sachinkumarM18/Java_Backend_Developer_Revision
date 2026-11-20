package com.Exception.Return;

import java.util.*;

public class ReturnInsideCatchBlock {
	public static int calculate() {
		try {
			int result = 10 / 0;
			return result;
		} catch (Exception e) {
			return 20;
		} finally {
			System.out.println("Printing Final Value");
		}
	}

	public static void main(String[] args) {
		System.out.println(calculate());
	}
}