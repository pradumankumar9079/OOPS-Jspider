package com.jspider.typecasting;

public class NarrowingProgram1 {
	public static void main(String[] args) {
		double d = 3.4;
		int a = (int) d;// Narrowing : double-->int
		System.out.println(a);

		int x = 97;
		char c = (char) x; // Narrowing : int -->char
		System.out.println(c);

		double val = 5.678;
		float num = (float) val;// Narrowing : double-->num
		System.out.println(num);
	}
}
