package com.coding.Challenge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class Employee {
	private int id;
	private String name;
	private double salary;

	// Constructor
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	// Getters and Setters
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "ID: " + id + " | " + name + " | ₹" + salary;
	}

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(101, "Rahul", 75000));
		employees.add(new Employee(102, "Priya", 92000));
		employees.add(new Employee(103, "Amit", 48000));
		employees.add(new Employee(104, "Sneha", 115000));
		employees.add(new Employee(105, "Vikram", 60000));
		employees.add(new Employee(106, "Ananya", 92000)); // Duplicate salary
		employees.add(new Employee(107, "Rohan", 83000));
		employees.add(new Employee(108, "Kavita", 54000));
		employees.add(new Employee(109, "Suresh", 125000));
		employees.add(new Employee(102, "Priya", 92000)); // Duplicate ID & record

		// Print all 10 employees
		// employees.forEach(System.out::println);

		// Print data using Map
		Map<Integer, Employee> employeeToMap = employees.stream().distinct()
				.collect(Collectors.toMap(Employee::getId, Function.identity(), (existing, replace) -> existing));
		// Display the Result
		// employeeToMap.forEach((id, emp) -> System.out.println("Id : " + id + " -> " +
		// "EMP : " + emp));

		// Find Second Highest Salary
		double secondSalary = employees.stream().map(Employee::getSalary).distinct().sorted(Comparator.reverseOrder())
				.skip(1).findFirst().orElse(0.0);
		employees.stream().filter(emp -> emp.getSalary() == secondSalary)
				.forEach(e -> System.out.println("Emp : " + e.getName() + "Salary : " + e.getSalary()));
	}
}
