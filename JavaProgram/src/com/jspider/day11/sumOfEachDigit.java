package com.jspider.day11;

import java.util.Scanner;

public class sumOfEachDigit {
	static void sumOfDigit(int n) {
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			sum += rem;
			n /= 10;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = sc.nextInt();

		sumOfDigit(n);
	}
}
