package com.practice;

public class OrderTask implements Runnable {

	@Override
	public void run() {
		executingOrderTask();
	}

	public void executingOrderTask() {
		System.out.println("Executing the Order Task ......");
	}

	public static void main(String[] args) {
		OrderTask task = new OrderTask();
		OrderTask task2 = new OrderTask();

		Thread t1 = new Thread(task);
		Thread t2 = new Thread(task);

		Thread t3 = new Thread(task2);
		Thread t4 = new Thread(task2);

		t1.start();
		t2.start();

		t3.start();
		t4.start();
	}

}
