package com.coding.Challenge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortEmployeeBySalary {

	private String name;
	private double salary;

	// Constructor
	public SortEmployeeBySalary(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	// Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return name + " : ₹" + salary;
	}

	public static void main(String[] args) {

		List<SortEmployeeBySalary> employees = new ArrayList<>();
		employees.add(new SortEmployeeBySalary("Rahul", 75000));
		employees.add(new SortEmployeeBySalary("Priya", 92000));
		employees.add(new SortEmployeeBySalary("Amit", 48000));
		employees.add(new SortEmployeeBySalary("Sneha", 115000));
		employees.add(new SortEmployeeBySalary("Vikram", 60000));
		employees.add(new SortEmployeeBySalary("Ananya", 92000));

		// Low to High
		List<SortEmployeeBySalary> lowToHigh = employees.stream()
				.sorted(Comparator.comparingDouble(SortEmployeeBySalary::getSalary)).toList();
		System.out.println("Low to High : " + lowToHigh);

		// High to Low
		List<SortEmployeeBySalary> highToLow = employees.stream()
				.sorted(Comparator.comparingDouble(SortEmployeeBySalary::getSalary).reversed()).toList();
		System.out.println("High to Low :" + highToLow);
	} 
}
