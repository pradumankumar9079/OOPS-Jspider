package com.jspider.day34string2;

import java.util.Scanner;

// WAP To Find Number of Vowel and Consonent Present in User Entered String 
public class CountConsonentAndVowelInString2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String Value: ");
		String s = sc.nextLine();

		// We Can do this as Well instead of small a to z convert to A to Z
//		s = s.toUpperCase();

		int vowelCount = 0;
		int consonentCount = 0;

		for (int i = 0; i <= s.length() - 1; i++) {

			char ch = s.charAt(i);

			// Avoiding special character and digit
			if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {

				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
						|| ch == 'O' || ch == 'U') {
					vowelCount++;
				} else {
					consonentCount++;
				}
			}
		}
		System.out.println("Vowel Count is: " + vowelCount);
		System.out.println("Consonent Count is: " + consonentCount);
	}
}

//Enter String Value: 
//6578hjkl
//Vowel Count is: 0
//Consonent Count is: 4
