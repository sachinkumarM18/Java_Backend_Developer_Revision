package com.practice2;

class Bank {
	static int balance = 1000;

	public static synchronized void withdraw(int amount) {
		if (balance >= amount) {
			balance -= amount;
			System.out.println(Thread.currentThread().getName() + " remaining balance : " + balance);
		} else {
			System.out.println("Insufficient Balance");
		}
	}
}

class StaticSynchronization {

	public static void main(String[] args) {
		Bank bank = new Bank();
		Thread t1 = new Thread(() -> bank.withdraw(700), "Thread-1");
		Thread t2 = new Thread(() -> bank.withdraw(500), "Thread-2");

		t1.start();
		t2.start();
	}

}
