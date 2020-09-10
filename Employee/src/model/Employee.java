package model;

public class Employee {
	
	//Declaring variables
	private String name;
	private double monthlySalary;
	private int age;
	
	//Default constructor
	public Employee() {
	}
	
	//Parameterized Constructor
	public Employee(String name) {
		this.name = name;
	}

	//Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
