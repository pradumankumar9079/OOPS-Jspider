package com.jspider.constructors;

class Employee {
	Employee(double ctc) {
		System.out.println("Engineer");
	}

	Employee(double ctc, int bonus) {
		System.out.println("Team Lead");
	}

	Employee(double ctc, int bonus, int incentives) {
		System.out.println("Manager");
	}
}

public class MainClass2 {
	public static void main(String[] args) {
		// Every Employee Object is having different capabilities
		Employee e1 = new Employee(3.5);
		Employee e2 = new Employee(2.5, 2);
		Employee e3 = new Employee(1.5, 4, 6);

	}

}
