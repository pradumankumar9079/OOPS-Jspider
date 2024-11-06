package com.jspider.day33string1;

import java.util.Scanner;

// WAP to count Alphabet ,Digit, Special Character present in string
public class CountAlphabatesDigitsSpecialCharacter3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String s = sc.nextLine();

		int alphabateCount = 0;
		int digitCount = 0;
		int specialCharacterCount = 0;

		/****************************************/
		// Having Specific Range For:-
		// UpperCase --> 65 to 90(A to Z)
		// LowerCase --> 97 to 122(a to z)
		// Digits --> 48 to 57 ('0' to '9')
		// but not having Range for special Character
		/****************************************/

		for (int i = 0; i <= s.length() - 1; i++) {
			// make variable it will decrease complexity
			char ch = s.charAt(i);

			// Internally it's comparing ASCII Value like 65<=97(A<=a)

			// in (and) if one condition is false not check for next one--> get Skipped

			// in (or) if one condition is true it will not check next-->get Skipped

			if (ch >= 'a' && ch <= 'z' || ch >= 65 && ch <= 90) {
				alphabateCount++;
			} else if (ch >= '0' && ch <= '9') {
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
