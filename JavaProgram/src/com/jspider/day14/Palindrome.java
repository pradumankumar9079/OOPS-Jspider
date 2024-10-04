package com.jspider.day14;

import java.util.Scanner;

// if rev of num is equal to that num Palindrome 
//eg: 12321
public class Palindrome {
	static boolean isPalindrome(int n) {
		int originalNumber = n;
		int rev = 0;
		while (n > 0) {
			int rem = n % 10;
			rev = rev * 10 + rem;
			n /= 10;
		}
		return rev == originalNumber;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = sc.nextInt();

		boolean pal = isPalindrome(n);
		if (pal == true)
			System.out.println(n + " is Palindrome");
		else
			System.out.println(n + " is not Palindrome");
	}
}
