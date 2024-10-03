package com.jspider.day21;

import java.util.Scanner;

// 107-->6B
public class DecimalToHexaDecimalPractice {
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
