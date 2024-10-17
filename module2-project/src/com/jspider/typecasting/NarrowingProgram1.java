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

		// Mine One
//		 * // char example while revise // where char comes-->before int size 2 bytes
//		 * like short // it is better to write casting statement for char int ch =
//		 * 'a';// Widening short ch1 = 'z';// Widening byte ch2 = 'z';// --> Somehow
//		 * it's Possible-->becoz 65,535 can't hold byte so Narrowing
//		 * System.out.println(ch); System.out.println(ch1); System.out.println(ch2);

	}
}
