package com.practice2;

public class InterruptExample {

	public static void main(String[] args) {
		Thread worker = new Thread(() -> {
			try {
				System.out.println("Order Processing Started...");
				Thread.sleep(200);
				System.out.println("Order Processing Completed...");
			} catch (InterruptedException e) {
				System.out.println("Order Processing Interrupted...");
			}
		});

		worker.start();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}

		worker.interrupt();
	}

}
