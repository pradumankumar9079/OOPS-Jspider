package com.jspider.hasarelationship6;

class Engine {
	void power() {
		System.out.println("Engine is Giving Power: ");
	}
}

class Driver {
	void drive() {
		System.out.println("Driver is driving: ");
	}
}

class Car {
	// if the contained object will not survive without container
	// it's Composition
	Engine eng = new Engine();

	// Vice Versa
	Driver dr = new Driver();
}

public class MainClass2 {
	public static void main(String[] args) {
		Car cr = new Car();
		cr.eng.power();
		cr.dr.drive();
	}
}
