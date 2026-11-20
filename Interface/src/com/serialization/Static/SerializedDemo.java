package com.serialization.Static;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializedDemo {

	public static void main(String[] args) throws IOException {

		Customer.setCollegeName("Gnanamani College of Technology");
		Customer customer = new Customer(131, "Rohit", "Software Engineer");

		FileOutputStream fos = new FileOutputStream("customer.ser1");
		ObjectOutputStream oid = new ObjectOutputStream(fos);
		oid.writeObject(customer);

		System.out.println("Serialization Done....");
	}

}
