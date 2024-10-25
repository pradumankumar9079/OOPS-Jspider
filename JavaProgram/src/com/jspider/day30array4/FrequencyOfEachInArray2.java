package com.jspider.day30array4;

import java.util.Scanner;

public class FrequencyOfEachInArray2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size Of an Array: ");
		int size = sc.nextInt();

		int[] x = new int[size];
		System.out.println("Enter " + size + " number of Element in Array");
		for (int i = 0; i <= x.length - 1; i++) {
			x[i] = sc.nextInt();
		}

		frequency(x);
	}

	private static void frequency(int[] x) {
		for (int i = 0; i <= x.length - 1; i++) {
			int cnt = 0;
			for (int j = 0; j <= x.length - 1; j++) {
				if (x[i] == x[j])
					cnt++;
			}
			System.out.println(x[i] + " " + cnt);

		}
	}
}
