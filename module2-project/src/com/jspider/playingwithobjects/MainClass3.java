package com.jspider.playingwithobjects;

import java.util.Scanner;

class Circle {
	double radius;

	Circle(double radius) {
		this.radius = radius;
	}
}

class CircleManager {
	static Circle createCircle() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius: ");
		double rad = sc.nextDouble();
		Circle cir = new Circle(rad);
		return cir;
	}

	static void displayCircle(Circle c) {
		System.out.println("Radius is: " + c.radius);
	}
}

public class MainClass3 {
	public static void main(String[] args) {
		Circle c1 = CircleManager.createCircle();
		CircleManager.displayCircle(c1);

		System.out.println("-----------------");

		Circle c2 = CircleManager.createCircle();
		CircleManager.displayCircle(c2);
	}
}
