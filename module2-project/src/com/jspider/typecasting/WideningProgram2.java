package com.jspider.typecasting;

// Auto widening Example
public class WideningProgram2 {
	static void run(double d) {
		System.out.println("Value: " + d);
	}

	public static void main(String[] args) {
		run(4.5);
		run(10);// Widening int to double
		run('A');// Widening Char to Double
	}
}
