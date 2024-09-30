package com.jspider.playingwithobjects;

import java.util.Scanner;

class Student {
	double cgpa;
	int yop;

	Student(double cgpa, int yop) {
		this.cgpa = cgpa;
		this.yop = yop;
	}
}

class StudentManager {
	// Method to Create Student Object and return it
	static Student createStudent() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter cgpa: ");
		double cgpa = scn.nextDouble();

		System.out.println("Enter yop: ");
		int yop = scn.nextInt();

		Student st = new Student(cgpa, yop);
		return st;
	}

	static void displayStudentDetails(Student st) {
		System.out.println("Cgpa is: " + st.cgpa);
		System.out.println("Yop is: " + st.yop);
	}
}

public class MainClass4 {
	public static void main(String[] args) {
		Student st = StudentManager.createStudent();
		StudentManager.displayStudentDetails(st);
	}
}
