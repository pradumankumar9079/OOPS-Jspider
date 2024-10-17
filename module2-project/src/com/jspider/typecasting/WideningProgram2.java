package com.jspider.typecasting;

// Auto widening Example
public class WideningProgram2 {
	static void run(double d) {
		System.out.println("Value: " + d);
	}

	public static void main(String[] args) {
		// by default decimal value in java is double
		// to store in float convert into float f = 4.5f;, float f = (float)4.5;
		run(4.5);
		run(10);// Widening int to double
		run('A');// Widening Char to Double
	}
}
