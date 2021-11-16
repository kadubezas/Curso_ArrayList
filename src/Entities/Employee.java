package Entities;

public class Employee {
	
	private Integer id;
	private String name;
	private Double salary;
	
	public Employee(int id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public Integer getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public Double getSalary() {
		return salary;
	}
	
	public void percentageIncrease(double percentage) {
		salary += salary * (percentage/100);
	}
	
	public String toString() {
		return id+", "+name+", "+salary;
	}
}
