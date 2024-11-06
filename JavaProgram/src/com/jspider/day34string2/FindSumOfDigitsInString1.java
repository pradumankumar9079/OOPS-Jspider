package com.jspider.day34string2;

import java.util.Scanner;

// WAP To Find Sum Of Digits in Given String
public class FindSumOfDigitsInString1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String Value: ");
		String s = sc.nextLine();

		int sum = 0;

		for (int i = 0; i <= s.length() - 1; i++) {
			char ch = s.charAt(i);
			if (ch >= '0' && ch <= '9') {

				// it's Implicit Conversion Widening so no need to write Casting Statement--> if
				// writing it's also right

				int num = ch - 48;
//				System.out.println(num);
				sum = sum + num;
			}
		}
		System.out.println("Sum is: " + sum);
	}
}
//Enter String Value: 
//678bnm
//Sum is: 21
