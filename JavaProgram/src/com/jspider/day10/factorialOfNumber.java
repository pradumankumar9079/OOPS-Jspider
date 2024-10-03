package com.jspider.day10;

import java.util.Scanner;

//10 ,1*2*3*4*5*6*7*8*9*10=3628800
public class factorialOfNumber {
	static void factorial(int n) {
		int fact = 1;
		for (int i = 2; i <= n; i++) {
			fact *= i;
		}
		System.out.println(fact);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = sc.nextInt();

		factorial(n);
	}
}
