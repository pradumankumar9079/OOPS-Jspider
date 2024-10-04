package com.jspider.day13;

import java.util.Scanner;

public class reverseNumber {
	static void reverse(int n) {
		int rev = 0;
		while (n > 0) {
			int rem = n % 10;// 587-->Track
			// remember
			// 0*10+7=7
			// 7*10+8=78
			// 78*10+5=785
			rev = rev * 10 + rem;
			n /= 10;
		}
		System.out.println(rev);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = sc.nextInt();

		reverse(n);
	}
}
