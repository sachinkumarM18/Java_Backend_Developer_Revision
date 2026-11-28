
package com.ReentrantLock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount2 {

	private int balance = 10000;

	private final ReentrantLock lock = new ReentrantLock();

	public void withdraw(int amount) {

		try {

			if (lock.tryLock(5, TimeUnit.SECONDS)) {

				try {

					System.out.println(Thread.currentThread().getName() + " acquired Lock");

					if (balance >= amount) {

						System.out.println(Thread.currentThread().getName() + " processing Transaction");

						balance -= amount;

						System.out.println("Withdraw Successfully: " + amount);
						System.out.println("Remaining Balance: " + balance);

					} else {

						System.out.println("Insufficient Balance");
					}

				} finally {

					lock.unlock();
				}

			} else {

				System.out.println(Thread.currentThread().getName() + " could not acquire lock");
			}

		} catch (InterruptedException e) {

			Thread.currentThread().interrupt();

			System.out.println("Transaction interrupted");
		}
	}

	public static void main(String[] args) {

		BankAccount2 bank2 = new BankAccount2();

		Thread t1 = new Thread(() -> bank2.withdraw(7000), "Customer-1");

		Thread t2 = new Thread(() -> bank2.withdraw(5000), "Customer-2");

		t1.start();
		t2.start();
	}
}
