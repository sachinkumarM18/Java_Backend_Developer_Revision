package com.Exception.Return;

public class TryWithReturnInFinally {
	public static int calculate() {
		try {
			int result = 10 / 0;
			return result;
		} finally {
			return 100;
		}
	}

	public static void main(String[] args) {
		System.out.println(calculate());
	}
}
