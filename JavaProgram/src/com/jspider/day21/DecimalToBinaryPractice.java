package com.jspider.day21;

import java.util.Scanner;

//Eg: 13-->1101
public class DecimalToBinaryPractice {
	static void decToBin(int dec) {
		String bin = "";
		while (dec > 0) {
			int rem = dec % 2;
			bin = rem + bin;
			dec = dec / 2;
		}
		System.out.println(bin);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Decimal Number: ");
		int dec = sc.nextInt();
		decToBin(dec);
	}
}
