package com.deserialized;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.serialization.Student;

public class DeserializedDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("student.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student student = (Student) ois.readObject();
		System.out.println(student);
	}
}
