package com.jspider.day13;

import java.util.Scanner;

//Spy Number: sum of Each Digit is equal to product of each Digit
//Eg: 2141 -->8==8
public class spyNumber {
	static boolean isSpy(int n) {
		int sum = 0;
		int prod = 1;
		while (n > 0) {
			int rem = n % 10;
			sum += rem;
			prod *= rem;
			n /= 10;
		}
		return sum == prod;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = sc.nextInt();

		boolean spy = isSpy(n);
		if (spy) {
			System.out.println(n + " is Spy Number");
		} else {
			System.out.println(n + " is not Spy Number");
		}
	}
}
