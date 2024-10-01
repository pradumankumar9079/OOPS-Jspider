package com.jspider.playingwithobjects;

import java.util.Scanner;

// Playing With Objects means passing and returning objects

class Employee {
	int eId;
	double ctc;

	public Employee(int eId, double ctc) {
		this.eId = eId;
		this.ctc = ctc;
	}

}

class EmployeeUtility {
	static Employee creatEmployee() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Eid");
		int id = sc.nextInt();
		System.out.println("Enter ctc");
		double c = sc.nextDouble();

		Employee emp = new Employee(id, c);
		return emp;
	}

	static void displayEmployeeDetails(Employee e) {
		System.out.println("Eid is " + e.eId);
		System.out.println("Ctc is " + e.ctc);

	}
}

public class MainClass1 {
	public static void main(String[] args) {
		Employee e1 = EmployeeUtility.creatEmployee();
		EmployeeUtility.displayEmployeeDetails(e1);
		System.out.println("----------------------------------------");
		Employee e2 = EmployeeUtility.creatEmployee();
		EmployeeUtility.displayEmployeeDetails(e2);
		System.out.println("----------------------------------------");
		Employee e3 = EmployeeUtility.creatEmployee();
		EmployeeUtility.displayEmployeeDetails(e3);
	}
}
