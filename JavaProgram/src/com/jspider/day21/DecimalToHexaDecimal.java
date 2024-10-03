package com.jspider.day21;

import java.util.Scanner;

//Important
// Decimal To HexaDecimal 
// ASCII--> American Standard of Coding for Information Interchange how many?
//A-Z--> 65 to 90
//a-z--> 97 to 122
//0-9--> 48 to 57
// Other than this Range Special Character
// 31 --1F
public class DecimalToHexaDecimal {
	static void decToHex(int dec) {
		String hex = "";
		while (dec > 0) {
			int rem = dec % 16;
			if (rem > 9) {
				hex = (char) (rem + 55) + hex;
			} else {
				hex = rem + hex;
			}
			dec = dec / 16;
		}
		System.out.println(hex);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Decimal Number: ");
		int dec = sc.nextInt();

		decToHex(dec);
	}
}
