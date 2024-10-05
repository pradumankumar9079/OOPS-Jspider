package com.jspider.day22;

import java.util.Scanner;

public class BinaryToDecimal {
	static int power(int p) {
		int n = 2;
		int pow = 1;
		for (int i = 1; i <= p; i++) {
			pow *= n;
		}
		return pow;
	}

	static void binToDec(String bin) {
		int bin1 = Integer.valueOf(bin);
		int dec = 0;
		int i = 0;
		while (bin1 > 0) {
			int rem = bin1 % 10;
			// Built in Method
//			int pow = (int) Math.pow(2, i++);
//			dec = dec + (rem *pow );

			// own method power
			dec = dec + (rem * power(i++));
			bin1 = bin1 / 10;
		}
		System.out.println(dec);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Binary Number: ");
//		int bin = sc.nextInt();
		String bin = sc.nextLine();

		boolean flag = true;
		for (int i = 0; i < bin.length(); i++) {
			if (!(bin.charAt(i) == '0' || bin.charAt(i) == '1')) {
				flag = false;
				break;
			}
		}

		if (flag == true) {
			binToDec(bin);
		} else {
			System.out.println("Invalid Binary");
		}

	}
}
