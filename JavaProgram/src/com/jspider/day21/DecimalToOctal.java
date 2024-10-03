package com.jspider.day21;

import java.util.Scanner;

// Number System Decimal To Octal for 47-->57
public class DecimalToOctal {
	static void decToOct(int dec) {
		String oct = "";
		while (dec > 0) {
			int rem = dec % 8;
			oct = rem + oct;
			dec = dec / 8;
		}
		System.out.println(oct);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Decimal Value: ");
		int dec = sc.nextInt();

		decToOct(dec);
	}
}
