package com.jspider.day21;

import java.util.Scanner;

// Helpful in Array And String
public class SwapUsingTemp {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Number1: ");
		int a = scn.nextInt();
		System.out.println("Enter Number2: ");
		int b = scn.nextInt();

		System.out.println("Before Swap: ");
		System.out.print(a + " " + b);
		System.out.println();

		int temp = a;
		a = b;
		b = temp;

		System.out.println("After Swap: ");
		System.out.print(a + " " + b);
		// if we are using method than it will not affect here
	}
}
