package com.jspider.day21;

import java.util.Scanner;

//25-->31
public class DecimalToOctalPractice {
	static void decToOctal(int dec) {
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
		System.out.println("Enter Decimal Number: ");
		int dec = sc.nextInt();

		decToOctal(dec);
	}
}
