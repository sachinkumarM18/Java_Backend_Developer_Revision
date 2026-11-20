package com.Exception1;

public class BankAccount {
	int balance;

	public BankAccount(int balance) {
		this.balance = balance;
	}

	public void withdrawBalance(int amount) throws IllegalAccessException {
		if (amount > balance) {
			throw new IllegalAccessException("Insufficient Balance");
		} else {
			balance -= amount;
			System.out.println("Transaction Completed....");
		}
		System.out.println("Available Balance : " + balance);
	}

	public void depositeBalance(int amount) {
		if (amount <= 0) {
			throw new IllegalArgumentException("Amount must be Greater than zero");
		} else {
			balance += amount;
			System.out.println("Transaction Completed....");
		}

		System.out.println("Available Balance : " + balance);
	}

	public static void main(String[] args) throws IllegalAccessException {
		BankAccount bank = new BankAccount(1000);
		bank.depositeBalance(8);
	}
}
