package com.jspider.constructorchaining;

// Constructor Chaining Eg:1 
class Hotel {
	Hotel() {
		System.out.println("KFC");
	}

	Hotel(int a) {
		// This off only work on first line
		this();// it will call Zero Argument
		System.out.println("Dominos");
	}

	Hotel(String s) {
		this(10); // it will call Integer one
		System.out.println("MCDonalds");
	}
}

public class MainClass1 {
	public static void main(String[] args) {
		Hotel h1 = new Hotel("ABC");
	}
}
