package com.jspider.day21;

import java.util.Scanner;

// Important 
public class SwapWithoutUsingTemp {
	static void swap(int a, int b) {
		System.out.println("Before Swap: ");
		System.out.print(a + " " + b);
		System.out.println();
		a = a + b;// a=10+20=30
		b = a - b;// b=30-20=10// first perform this(Order matter Here)
		a = a - b;// a=30-10=20// than this
		System.out.println("After Swap: ");
		System.out.print(a + " " + b);
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Number1: ");
		int a = scn.nextInt();
		System.out.println("Enter Number2: ");
		int b = scn.nextInt();
		// here a,b not change

		swap(a, b);
	}
}
