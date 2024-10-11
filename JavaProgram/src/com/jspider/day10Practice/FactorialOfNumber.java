package com.jspider.day10Practice;

import java.util.Scanner;

//5
//120
public class FactorialOfNumber {
	static void fact(int n) {
		int prod = 1;
		for (int i = 2; i <= n; i++) {
			prod = prod * i;
		}
		System.out.println(prod);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = sc.nextInt();

		fact(n);
	}
}
