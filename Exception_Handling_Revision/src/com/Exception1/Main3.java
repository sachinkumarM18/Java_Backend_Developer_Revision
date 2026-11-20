package com.Exception1;

public class Main3 {

	public static void main(String[] args) {

//		try {
//			System.out.println("A");
//			int result = 10 / 0;
//			System.out.println("B");
//		} catch (ArithmeticException e) {
//			System.out.println("C");
//
//			return;
//
//		} finally {
//			System.out.println("D");
//		}
//
//		System.out.println("E");

		try {

			System.out.println("A");

			try {

				int result = 10 / 0;

			} catch (NullPointerException e) {

				System.out.println("B");

			}

			System.out.println("C");

		} catch (ArithmeticException e) {

			System.out.println("D");

		}

		System.out.println("E");
	}

}
