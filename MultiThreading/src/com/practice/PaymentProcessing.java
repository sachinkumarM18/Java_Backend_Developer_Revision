package com.practice;

public class PaymentProcessing implements Runnable {
	@Override
	public void run() {
		paymentProcessing();
	}

	public void paymentProcessing() {
		System.out.println("Payment Processing....");
	}

	public static void main(String[] args) {
		PaymentProcessing payment1 = new PaymentProcessing();

		Thread t1 = new Thread(payment1);
		Thread t2 = new Thread(payment1);

		t1.start();
		t2.start();

	}

}
