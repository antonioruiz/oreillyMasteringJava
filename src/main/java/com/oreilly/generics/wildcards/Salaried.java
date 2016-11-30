package com.oreilly.generics.wildcards;

public class Salaried extends Employee {

	public static final double DEFAULT_SALARY = 120000;

	private double salary = DEFAULT_SALARY;
	
	public Salaried(String name) {
		this(name, DEFAULT_SALARY);
	}

	public Salaried(String name, double defaultSalary) {
		super(name);
		setSalary(defaultSalary);
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return String.format("Salaried {name=%ssalary=%s } %s", salary, getName(), super.toString());
	}

	
}
