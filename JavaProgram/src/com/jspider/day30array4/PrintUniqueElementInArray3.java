package com.jspider.day30array4;

import java.util.Scanner;

public class PrintUniqueElementInArray3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size Of an Array: ");
		int size = sc.nextInt();

		int[] x = new int[size];
		System.out.println("Enter " + size + " number of Element in Array");
		for (int i = 0; i <= x.length - 1; i++) {
			x[i] = sc.nextInt();
		}

		isUnique(x);
	}

	private static void isUnique(int[] x) {
		for (int i = 0; i <= x.length - 1; i++) {
			boolean unique = true;
			for (int j = 0; j <= x.length - 1; j++) {
				if (x[i] == x[j] && i != j) {
					unique = false;
					break;
				}
			}
			if (unique) {
				System.out.print(x[i] + " ");
			}
		}
	}
}
