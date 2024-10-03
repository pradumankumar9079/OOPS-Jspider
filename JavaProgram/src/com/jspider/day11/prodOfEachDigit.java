package com.jspider.day11;

import java.util.Scanner;

public class prodOfEachDigit {
	static void prodOfDigit(int n) {
		int prod = 1;
		while (n > 0) {
			int rem = n % 10;
			prod *= rem;
			n /= 10;
		}
		System.out.println(prod);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = sc.nextInt();

		prodOfDigit(n);
	}
}
