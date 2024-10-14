package com.jspider.day22Practice;

import java.util.Scanner;

// 1010-->10
public class BinaryToDecimal {
	static void binToDec(int bin) {
		int dec = 0, i = 0;
		boolean flag = true;
		while (bin > 0) {
			int rem = bin % 10;
			if (rem == 0 || rem == 1) {
				dec = dec + rem * (int) Math.pow(2, i++);
				bin = bin / 10;
			} else {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println(dec);
		} else {
			System.out.println("Enter Valid Binary: ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int bin = sc.nextInt();

		binToDec(bin);
	}
}
