package com.jspider.day30array4;

import java.util.Arrays;
import java.util.Scanner;

// merge two user entered array
public class Practice1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size Of an Array: ");
		int size1 = sc.nextInt();

		int[] x = new int[size1];
		System.out.println("Enter " + size1 + " number of Element in Array");
		for (int i = 0; i <= x.length - 1; i++) {
			x[i] = sc.nextInt();
		}

		System.out.println("Enter Size Of an Array: ");
		int size2 = sc.nextInt();

		int[] y = new int[size2];
		System.out.println("Enter " + size2 + " number of Element in Array");
		for (int i = 0; i <= y.length - 1; i++) {
			y[i] = sc.nextInt();
		}

		int res[] = merge(x, y);
		System.out.println(Arrays.toString(res));
	}

	private static int[] merge(int[] x, int[] y) {
		int sizeOfNew = x.length + y.length;
		int newArr[] = new int[sizeOfNew];

		// or use this
		// int i;
		for (int i = 0; i <= x.length - 1; i++) {
			newArr[i] = x[i];
		}

		// after old array length it will start inserting value
		for (int j = 0; j <= y.length - 1; j++) {
			newArr[x.length + j] = y[j];
		}

		return newArr;
	}
}
