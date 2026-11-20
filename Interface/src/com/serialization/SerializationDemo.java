package com.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) throws IOException {
		Student student = new Student("101", "Sachin", "CSE");

		FileOutputStream fos = new FileOutputStream("student.ser");

		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(student);
		System.out.println("Student Successfully Serialized");
	}

}
