package com.jspider.day10Practice;

import java.util.Scanner;

//if the sum of positive divisors excluding the number itself is equal to that number
//6-->1+2+3
public class PerfectOrNot {
	static void isPerfect(int n) {
		int sum = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0)
				sum = sum + i;
		}
		if (sum == n)
			System.out.println(n + " Perfect Number");
		else
			System.out.println(n + " is Not Perfect");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = sc.nextInt();

		isPerfect(n);
	}
}
