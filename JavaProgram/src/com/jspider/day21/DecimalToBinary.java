package com.jspider.day21;

import java.util.Scanner;

//Number System Decimal To Binary for 13-->1101
public class DecimalToBinary {

	static String decToBin(int dec) {
		String bin = "";
		while (dec > 0) {
			int rem = dec % 2;
//			bin = bin + rem;-->it will not give reverse
			bin = rem + bin;// --> Adding at start
			dec = dec / 2;

		}
		return bin;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Decimal Value");
		int dec = sc.nextInt();

		String bin = decToBin(dec);
		System.out.println("Binary for number " + dec + " is " + bin);
	}
}
