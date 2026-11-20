package com.serialization.Static;

import java.io.Serializable;

public class Customer implements Serializable {
	private int id;
	private String name;
	private String dept;

	private static final long serialVersionUID = 5l;
	private static String collegeName = "Gnanamani College of Technology";

	public Customer(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", dept=" + dept + " , collegeName=" + getCollegeName() + "]";
	}

	public static String getCollegeName() {
		return collegeName;
	}

	public static void setCollegeName(String collegeName) {
		Customer.collegeName = collegeName;
	}

}
