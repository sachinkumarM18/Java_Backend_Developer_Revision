package com.practice;

public class ThreadLifeCycle {

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(() -> {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				Thread.currentThread().interrupt();
			}
		});

		System.out.println(t1.getState());
		t1.start();

		Thread.sleep(500);
		System.out.println(t1.getState());
		t1.join();

		System.out.println(t1.getState());
	}

}
