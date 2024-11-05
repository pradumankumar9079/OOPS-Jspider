package com.jspider.day32array6;

import java.util.Arrays;
import java.util.Scanner;

// WAP To Reverse an Array
public class ReverseArray3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size: ");
		int size = sc.nextInt();
		int[] x = new int[size];

		// Taking User Element
		System.out.println("Enter " + size + " Number of Element: ");
		for (int i = 0; i <= x.length - 1; i++) {
			x[i] = sc.nextInt();
		}

		// it's not like string it will change in original array

		// for String we need to return new String and than Store here than Print

		reverse(x);
		System.out.println(Arrays.toString(x));
	}

	private static void reverse(int[] x) {
		// Two Pointer Approach --> Optimal one
		int firstIndex = 0;// for zero'th index
		int lastIndex = x.length - 1; // for last index

		// don't know how many iteration will happened here
		// if we have 4 element number of iteration will be 2(Half)
		// that's why it is optimal way

		// in case of odd number of element middle element swap with same element so not
		// recommended to take equal to
		while (firstIndex < lastIndex) {
			// don't make swap method it will not swap here it will swap in method always
			int temp = x[firstIndex];
			x[firstIndex] = x[lastIndex];
			x[lastIndex] = temp;
			firstIndex++;
			lastIndex--;
		}
	}
}
