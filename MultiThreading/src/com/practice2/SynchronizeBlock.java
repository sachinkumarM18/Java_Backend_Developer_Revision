package com.practice2;

class Inventory {
	private int stock = 1;

	public void purchase() {
		System.out.println(Thread.currentThread().getName() + " started purchasing");

		synchronized (this) {
			if (stock > 0) {
				System.out.println(Thread.currentThread().getName() + " Purchased product");
				stock--;
			} else {
				System.out.println("Out Of Stuck");
			}

		}
		System.out.println(Thread.currentThread().getName() + " finished");
	}

}

class SynchronizeBlock {

	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		Thread t1 = new Thread(() -> inventory.purchase());
		Thread t2 = new Thread(() -> inventory.purchase());

		t1.start();
		t2.start();
	}

}
