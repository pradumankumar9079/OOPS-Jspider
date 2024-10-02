package com.jspider.constructorchaining;

// Constructor Chaining Eg:3
class Food {
	Food(int a) {
		this(4.5);
		System.out.println("Biryani");
	}

	Food(double d) {
		this("ABC");

		System.out.println("MasalaDosa");
	}

	Food(String s) {
		System.out.println("Pongal");
	}
}

public class MainClass3 {
	public static void main(String[] args) {
		Food f = new Food(10);
	}
}
