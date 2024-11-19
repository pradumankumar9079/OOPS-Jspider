package com.jspider.day44recursion;

// WAP To Print1ToN
public class Print1ToNClass1 {
	public static void main(String[] args) {
		int n = 5;
		print1ToN(n);
	}

	private static void print1ToN(int n) {
		System.out.println(n);
		// Base Condition To Stop Else it will run infinite
		// and than stackoverflow occur
		// if i will use >= i will get Zero Here as well
		if (n > 1) {
			print1ToN(n - 1);
		}
	}
}
//5
//4
//3
//2
//1
