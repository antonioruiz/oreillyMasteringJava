package com.oreilly.generics.wildcards;

import java.util.Arrays;
import java.util.List;

public class HRDemo {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
				new Employee("Bart"), new Employee("Homer"),
				new Employee("Lisa"), new Employee("Maggie"));
		
		List<Salaried> salarieds = Arrays.asList(
				new Salaried("Kyle"), new Salaried("Stan"),
				new Salaried("Kenny"), new Salaried("Cartman"));
		System.out.println(employees);
		System.out.println("-------");
		System.out.println(salarieds);
		
		HR.printEmpNames(employees);
		System.out.println("-------");
		HR.printEmpAndSubclassNames(salarieds);
		System.out.println("-------");
		HR.printAllFiltered(employees, 
				e -> e.toString().length() % 2 == 0);
	}

}
