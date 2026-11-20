package com.coding.Challenge.Adv;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeManagementSystem {

	private static Map<Integer, Employee> empData = new HashMap<Integer, Employee>();
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int choice = 0;
		do {
			System.out.println("\n=== Employee Management System ===");
			System.out.println("1. Add Employee");
			System.out.println("2. View All Employees");
			System.out.println("3. Search Employee");
			System.out.println("4. Update Employee Salary");
			System.out.println("5. Delete Employee");
			System.out.println("6. Count Employees");
			System.out.println("7. Exit");
			System.out.print("Enter your choice: ");

			while (!sc.hasNext()) {
				System.out.print("Invalid input. Please enter a number (1-7): ");
				sc.next();
			}

			choice = sc.nextInt();
			switch (choice) {
			case 1:
				addEmployee();
				break;
			case 2:
				viewAllProducts();
				break;

			case 3:
				searchEmployee();
				break;

			case 4:
				updateEmpSalary();
				break;

			case 5:
				deleteEmployee();
				break;

			case 6:
				countEmployee();
				break;

			case 7:
				System.out.println("Exiting Employee Management System. Goodbye!");
				break;
			default:
				System.out.println("Invalid choice! Please select between 1 and 7.");
			}
		} while (choice != 7);

		sc.close();
	}

	// Add Employee
	private static void addEmployee() {
		System.out.print("Enter Employee Id : ");
		int id = sc.nextInt();
		sc.nextLine();

		if (empData.containsKey(id)) {
			System.out.println("Error: Employee with ID " + id + " already exists!");
			return;
		}

		System.out.print("Enter Employee Name : ");
		String name = sc.nextLine();

		System.out.print("Enter Department: ");
		String department = sc.nextLine();

		System.out.print("Enter Salary: ");
		double salary = sc.nextDouble();

		Employee emp = new Employee(id, name, department, salary);
		empData.put(id, emp);

		System.out.println("Employee Added Successfully...");
	}

	// View All Products
	private static void viewAllProducts() {
		if (empData.isEmpty()) {
			System.out.println("No Employee Record Found");
		}

		System.out.println("===== All Employee Records =====");
		for (Employee emp : empData.values()) {
			System.out.println(emp);
		}
	}

	// Search Employee
	private static void searchEmployee() {
		System.out.println("Enter Employee Id to Search : ");
		int id = sc.nextInt();

		Employee emp = empData.get(id);
		if (emp != null) {
			System.out.println("Employee Found: " + emp);
		} else {
			System.out.println("Error: Employee with ID " + id + " does not exist.");
		}
	}

	// Update Employee Salary
	private static void updateEmpSalary() {
		System.out.print("Enter Employee ID to update salary: ");
		int id = sc.nextInt();

		Employee emp = empData.get(id);
		if (emp != null) {
			System.out.println("Enter New Salary for " + emp.getName() + " :");
			double newSalary = sc.nextDouble();
			emp.setSalary(newSalary);
			System.out.println("Salary updated successfully! Updated record: " + emp);
		} else {
			System.out.println("Error: Employee with ID " + id + " does not exist.");
		}
	}

	// Delete Employee
	private static void deleteEmployee() {
		System.out.print("Enter Employee ID to update salary: ");
		int id = sc.nextInt();

		Employee removedEmp = empData.remove(id);
		if (removedEmp != null) {
			System.out.println("Employee deleted successfully: " + removedEmp.getName());
		} else {
			System.out.println("Error: Employee with ID " + id + " does not exist.");
		}
	}

	// Count Employee
	private static void countEmployee() {
		System.out.println("Total Employee : " + empData.size());
	}
}
