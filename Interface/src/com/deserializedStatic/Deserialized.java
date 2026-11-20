package com.deserializedStatic;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.serialization.Static.Customer;

public class Deserialized {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Customer.setCollegeName("IIT Delhi");
		FileInputStream fis = new FileInputStream("customer.ser1");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Customer customer = (Customer) ois.readObject();
		System.out.println(customer);
	}

}
