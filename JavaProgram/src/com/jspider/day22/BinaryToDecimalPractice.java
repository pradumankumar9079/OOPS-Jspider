package com.jspider.day22;

import java.util.Scanner;

public class BinaryToDecimalPractice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Binary: ");
		int bin = sc.nextInt();
		binToDec(bin);
	}

	static void binToDec(int bin) {
		int p = 0;
		int dec = 0;
		boolean flag = false;

		while (bin > 0) {
			int rem = bin % 10;
			if (rem == 0 || rem == 1) {
				int pow = (int) Math.pow(2, p++);
				int prod = rem * pow;
				dec = dec + prod;
				bin = bin / 10;
			} else {
				bin = bin / 10;
				flag = true;
			}
		}
		System.out.println(dec);
		if (flag == false) {
		} else {
			System.out.println("Invalid Binary");
		}

	}
}
