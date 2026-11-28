package com.practice2;

import java.util.concurrent.atomic.AtomicInteger;

class SharedCounter {
	private int unsafeCount = 0;
	private int synCount = 0;
	private final AtomicInteger atomicCount = new AtomicInteger(0);

	public void increment() {
		unsafeCount++;
		synchronized (this) {
			synCount++;
		}
		atomicCount.incrementAndGet();
	}

	public void printResults() {
		System.out.println("UnSafe : " + unsafeCount + "| Sync : " + synCount + "| Atomic : " + atomicCount.get());
	}
}

class IntermediateSync {

	public static void main(String[] args) throws InterruptedException {
		SharedCounter counter = new SharedCounter();

		Runnable task = () -> {
			for (int i = 0; i < 10000; i++)
				counter.increment();
		};

		Thread t1 = new Thread(task);
		Thread t2 = new Thread(task);

		t1.start();
		t2.start();
		
		t1.join();
		t2.join();

		counter.printResults();

	}

}
