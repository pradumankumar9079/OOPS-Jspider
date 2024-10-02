package com.jspider.constructorchaining;

// Constructor Chaining Amazon Chaining(Eg:4)
class Amazon {
	Amazon() {
		System.out.println("Code to Initialize Principle");
	}

	Amazon(double fees) {
		this();// Dry Principle Use3d
		System.out.println("Code to Initialize Prime Features");
	}
}

public class AmazonExample {
	public static void main(String[] args) {
		Amazon a1 = new Amazon(1499.0);
	}

}
