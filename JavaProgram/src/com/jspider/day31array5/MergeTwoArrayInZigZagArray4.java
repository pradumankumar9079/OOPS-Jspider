package com.jspider.day31array5;

import java.util.Arrays;

//Trace it for better understanding
// WAP To Merge Two Array In ZigZag Format
public class MergeTwoArrayInZigZagArray4 {
	public static void main(String[] args) {
		int x[] = { 1, 2, 3, 4 };
		int y[] = { 5, 6, 7, 8, 9, 10 };

		int[] res = zigZag(x, y);
		System.out.println(Arrays.toString(res));
	}

	private static int[] zigZag(int[] x, int[] y) {
		int newArr[] = new int[x.length + y.length];

		int k = 0;

//		newArr.length - 1 either use this or use x.length - 1 || i <= y.length - 1 less Number of iteration here

		// if first condition true in || operator it will not check next condition it
		// will enter into loop
		for (int i = 0; i <= x.length - 1 || i <= y.length - 1; i++) {
			// Taking if condition because otherwise it will give Exception
			if (i < x.length) {
				newArr[k] = x[i];
				k++;
			}

			// use if not else elsewhere it will skip
			if (i < y.length) {
				newArr[k] = y[i];
				k++;
			}
		}
		return newArr;
	}
}

//[1, 5, 2, 6, 3, 7, 4, 8, 9, 10]
