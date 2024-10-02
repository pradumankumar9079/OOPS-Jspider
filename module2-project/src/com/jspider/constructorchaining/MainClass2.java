package com.jspider.constructorchaining;

//Constructor Chaining Eg:2 
class City {
	City() {
		System.out.println("New York");
	}

	City(int a) {
		this();
		System.out.println("London");
	}

	City(double d) {
		this(10);
		System.out.println("Paris");
	}
}

public class MainClass2 {
	public static void main(String[] args) {
		City c1 = new City(1.5);
	}
}
