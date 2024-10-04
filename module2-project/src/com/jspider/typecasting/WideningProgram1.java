package com.jspider.typecasting;

public class WideningProgram1 {
	public static void main(String[] args) {
		int a = 10;
		float f = a; // Widening : int ----->float
		System.out.println(f);

		long val = 1234567L;
		double num = val; // Widening : long-------->double
		System.out.println(num);

		char c = 'A';
		int b = c; // Widening: char-------->int
		System.out.println(b);
	}
}
