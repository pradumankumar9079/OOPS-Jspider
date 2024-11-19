package com.jspider.day44recursion;

// WAP To PrintNTo1 --> BackTracking 
public class PrintNTo1Class2 {

	public static void main(String[] args) {
		int n = 5;
		print1ToN(n);
	}

	private static void print1ToN(int n) {
		// Base Condition To Stop Else it will run infinite
		// and than stackoverflow occur

		// BackTracking because we are calling first later when i am exiting than i am
		// printing it
		if (n > 1) {
			print1ToN(n - 1);
		}

		System.out.println(n);
	}
}
//1 
//2
//3
//4
//5
