package com.jspider.day15;

import java.util.Scanner;

// n to the power p-->Means Multiplying n p number of times
// eg: 2^3==2*2*2==8
public class findNToPowerP {
	static void power(int n, int p) {
		int pow = 1;
		for (int i = 1; i <= p; i++) {
			pow *= n;
		}
		System.out.println(pow);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value: ");
		int n = sc.nextInt();

		System.out.println("Enter p value: ");
		int p = sc.nextInt();

		power(n, p);
	}
}
