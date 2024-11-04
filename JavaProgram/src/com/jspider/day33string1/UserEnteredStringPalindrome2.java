package com.jspider.day33string1;

import java.util.Scanner;

// WAP To Check User Enter String is Palindrome or not
public class UserEnteredStringPalindrome2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String s = sc.nextLine();

		if (isPalindrome(s)) {
			System.out.println("Is Palindrome");
		} else {
			System.out.println("Is Not Palindrome");
		}
	}

	private static boolean isPalindrome(String s) {
		/***************************************************/
		// finding reverse using stringbuilder
		// sb is having reverse method
//		StringBuilder sb = new StringBuilder(s);
//		sb.reverse();
////		System.out.println(sb);
//		// don't use == it is comparing object address not content
//		return s.equals(sb.toString());
		/***************************************************/

		/***************************************************/
		// Using string literal
		// do not assign null it's also a value
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
			// can't do rev = rev.concat(s.charAt(i)) because arg is character here
//			concat only take string
		}
		System.out.println(rev);

		// use string1.equals(string2) only don't use == (else wrong answer)
		return rev.equals(s);

	}
}
//Enter String: 
//ab 1 ba
//Is Palindrome
