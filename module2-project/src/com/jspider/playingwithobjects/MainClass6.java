package com.jspider.playingwithobjects;

import java.util.Scanner;

class Bike {
	int cc;
	int mileage;

	Bike(int cc, int mileage) {
		this.cc = cc;
		this.mileage = mileage;
	}
}

class Bikeseller {
	static Bike createBike() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter cc: ");
		int cc = scn.nextInt();

		System.out.println("Enter Mileage: ");
		int mileage = scn.nextInt();

		Bike b = new Bike(cc, mileage);
		return b;
	}

	static void displayBike(Bike b) {
		System.out.println("CC is: " + b.cc);
		System.out.println("Mileage is: " + b.mileage);
	}
}

public class MainClass6 {
	public static void main(String[] args) {
		Bike b1 = Bikeseller.createBike();
		Bikeseller.displayBike(b1);

		System.out.println("--------------");

		Bike b2 = Bikeseller.createBike();
		Bikeseller.displayBike(b2);
	}
}
