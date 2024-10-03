package com.jspider.day10;

import java.util.Scanner;

// user entered Number is Perfect
// definition: - if sum of it's positive divisor excluding itself should be equal to that number
// Eg: 6,28 ,1+2+3=6
public class perfectNumber {
	static void isPerfect(int n) {
		int sum = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		if (sum == n)
			System.out.println(n + " is perfect Number");
		else
			System.out.println(n + " is Not Perfect Number");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = sc.nextInt();

		isPerfect(n);
	}
}
