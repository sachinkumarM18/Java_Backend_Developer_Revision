package com.practice2;

class Inventry {
	int stock = 1;

	public synchronized void purchase() {
		if (stock > 0) {
			System.out.println("Purchase Product");
			stock--;
		} else {
			System.out.println("Out Of Stock");
		}
	}
}

class RaceCondition {

	public static void main(String[] args) {
		Inventry inventry = new Inventry();

		Thread t1 = new Thread(() -> inventry.purchase());
		Thread t2 = new Thread(() -> inventry.purchase());

		t1.start();
		t2.start();
	}

}
