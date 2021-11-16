package Aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Employee;

public class Employees {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("How many employees will be registred? ");
		int n = sc.nextInt();

		List<Employee> employees = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + ":");

			System.out.print("Id: ");
			Integer id = sc.nextInt();
			 while (hasId(employees, id)) {
					System.out.print("Id already taken. Try again: ");
					id = sc.nextInt();
			 }

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Salary: ");
			Double salary = sc.nextDouble();

			employees.add(new Employee(id, name, salary));
		}

		System.out.print("Enter the employee id that will have salary increase : ");
		int id = sc.nextInt();
		Employee employeedIncrease = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

		if (employeedIncrease == null) {

			System.out.println("This id does not exist!");

		} else {

			System.out.println("Enter the percentage: ");
			double percentage = sc.nextDouble();
			employeedIncrease.percentageIncrease(percentage);

		}

		System.out.println("List of employees");

		for (Employee x : employees) {
			System.out.println(x);
		}

		sc.close();
	}
	
	public static boolean hasId(List<Employee> list, int id) {
		Employee employeedIncrease = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return employeedIncrease != null;
	}

}
