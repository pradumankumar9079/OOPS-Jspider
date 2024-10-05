package com.jspider.day22;

import java.util.Scanner;

//0 1 1 2
public class PrintNFibonacciNumber {
	static void FibonacciNumber(int n) {
		int f1 = 0;
		int f2 = 1;
		int f3 = 0;
		System.out.println(f1 + " " + f2 + " ");
		for (int i = 1; i <= n - 2; i++) {
			f3 = f1 + f2;
			System.out.print(f3 + " ");
			f1 = f2;
			f2 = f3;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N Value: ");
		int n = sc.nextInt();

		FibonacciNumber(n);
	}
}
