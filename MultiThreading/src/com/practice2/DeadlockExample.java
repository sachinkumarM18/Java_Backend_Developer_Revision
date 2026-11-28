package com.practice2;

public class DeadlockExample {
	static Object lockA = new Object();
	static Object lockB = new Object();

	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {
			synchronized (lockA) {
				System.out.println("Thread 1 acquired Lock A");
				synchronized (lockB) {
					System.out.println("Thread 1 acquired Lock B");
				}
			}
		});

		Thread t2 = new Thread(() -> {
			synchronized (lockB) {
				System.out.println("Thread 2 Acquired Lock B");
				synchronized (lockA) {
					System.out.println("Thread 2 Acquired Lock A");
				}
			}
		});

		t1.start();
		t2.start();
	}

}
