package com.jspider.day33string1;

import java.util.Scanner;

// WAP to count Alphabate ,Digit, Special Character present in string
public class CountAlphabatesDigitsSpecialCharacter3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String s = sc.nextLine();

		int alphabateCount = 0;
		int digitCount = 0;
		int specialCharacterCount = 0;
		for (int i = 0; i <= s.length() - 1; i++) {
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= 65 && s.charAt(i) <= 90) {
				alphabateCount++;
			} else if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				// or we can use 48 to 57
				digitCount++;
			} else {
				specialCharacterCount++;
			}
		}
		System.out.println("Alphabate Count " + alphabateCount + " digit Count " + digitCount
				+ " Special Character Count " + specialCharacterCount);
	}
}
//Enter String: 
//rajs sjd @ 3e4
//Alphabate Count 8 digit Count 2 Special Character Count 4
