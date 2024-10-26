package com.jspider.day30array4;

import java.util.Scanner;

// i loop represent current element
// j loop use to comparision of remaining element
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

	// j==0 won't work here j=i+1 will work
	// in that case if it work it will print duplicate occurrence as well
	private static void frequency(int[] x) {
		for (int i = 0; i <= x.length - 1; i++) {
			int cnt = 1;

			for (int j = i + 1; j <= x.length - 1; j++) {
				if (x[i] == x[j]) {
					cnt++;
					x[j] = Integer.MAX_VALUE;
				}
			}
			if (x[i] != Integer.MAX_VALUE) {
				System.out.println(x[i] + " " + cnt);
			}

		}
	}
}
