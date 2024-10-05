package com.alpha.day11function;

import java.util.Scanner;

//Eg: 110-->6, 1010-->10
public class BinaryToDecimal19 {
	static void binToDec(int bin) {
		int dec = 0;
		int i = 0;
		while (bin > 0) {
			int rem = bin % 10;
			dec = rem * (int) Math.pow(2, i++) + dec;
			bin /= 10;
		}
		System.out.println(dec);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Binary Number: ");
		int bin = sc.nextInt();

		binToDec(bin);

	}
}