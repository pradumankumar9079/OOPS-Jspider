package com.jspider.mam;

// refer diagram1 from note
interface Vehicle {
	void drive();
}

//class Car implements Vehicle {
//
//	@Override
//	public void drive() {
//		System.out.println("Driver has arrived");
//	}
//
//}

public class Driver {
	public static void main(String[] args) {
//		Vehicle v = new Car();

		// no need to use concrete class for lambda expression
		Vehicle v = () -> {
			System.out.println("Driver has arrived");
		};
		v.drive();
	}
}
