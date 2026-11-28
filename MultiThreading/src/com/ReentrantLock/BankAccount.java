package com.ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
	private final ReentrantLock lock = new ReentrantLock();
	private int balance = 1000;

	public void withdraw(int amount) {
		lock.lock();
		try {
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + " is trying to withdraw");

			if (balance >= amount) {
				System.out.println(threadName + " is processing Withrawal");
				balance = balance - amount;

				System.out.println(threadName + " successfully withdraw : " + amount);
				System.out.println("Remaining balance : " + balance);
			} else {
				System.out.println(threadName + " - Insufficient Balance");
			}

		} finally {
			lock.unlock();
		}
	}

	public static void main(String[] args) {
		BankAccount bank = new BankAccount();
		Thread t1 = new Thread(() -> bank.withdraw(700), "Thread-1");
		Thread t2 = new Thread(() -> bank.withdraw(500), "Thread-2");

		t1.start();
		t2.start();
	}
}
