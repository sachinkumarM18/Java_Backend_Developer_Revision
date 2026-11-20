package com.Exception.Return;

import java.util.*;

public class Main {
	public static int calculate() {
		try {
			System.out.println("A");
			return 100;
		} finally {
			System.out.println("B");
		}
	}

	public static void main(String[] args) {
		System.out.println(calculate());
	}
}
