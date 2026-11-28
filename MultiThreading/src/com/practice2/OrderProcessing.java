package com.practice2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class OrderProcessing {

	public static void main(String[] args) {

		ExecutorService executor = Executors.newSingleThreadExecutor();
		Future<?> future = executor.submit(() -> {
			try {
				System.out.println("Order Processing Started");
				for (int i = 1; i <= 10; i++) {
					if (Thread.currentThread().isInterrupted()) {
						return;
					}

					System.out.println("Processing Step : " + i);
					Thread.sleep(1000);
				}
				System.out.println("Order Completed..");

			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				System.out.println("Order Processing Interrupted");
				return;
			} finally {
				System.out.println("Cleanup up Order resources");
			}
		});

		try {
			Thread.sleep(4000);
			System.out.println("Cancelling Order Task..");
			future.cancel(true);
		} catch (Exception e) {
			Thread.currentThread().interrupt();
		} finally {
			executor.shutdown();
		} 
	}

}
