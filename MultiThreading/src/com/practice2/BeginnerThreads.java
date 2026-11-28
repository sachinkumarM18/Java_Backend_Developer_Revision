package com.practice2;

public class BeginnerThreads {
	public static void main(String[] args) throws InterruptedException {
		// Usinf Runnable with a Lambda
		Thread worker1 = new Thread(() -> {
			for (int i = 1; i <= 3; i++) {
				System.out.println("Worker 1- Step " + i);
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				}
			}
		});

		// 2. Another thread running concurrently
		Thread worker2 = new Thread(() -> {
			for (int i = 1; i <= 3; i++) {
				System.out.println("Worker 2 - Step " + i);
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				}
			}
		});

		// 3. Another Thread Running concurrently
		Thread worker3 = new Thread(() -> {
			for (int i = 1; i <= 3; i++) {
				System.out.println("Worker 3 - step - " + i);
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				}
			}
		});

		worker1.start();
		worker2.start();
		worker3.start();

		// join() makes the main thread wait untill both workers finish
		worker1.join();
		worker2.join();
		//worker3.join();

		System.out.println("All beginner tasks completed..");
	}
}
