package com.practice;

public class OrderThread extends Thread {
	@Override
	public void run() {
		System.out.println("Order Processing...");
	}

	public static void main(String[] args) {
		OrderThread orderThread1 = new OrderThread();
		OrderThread orderThread2 = new OrderThread();
		orderThread1.start();
		orderThread2.start();
	}
}