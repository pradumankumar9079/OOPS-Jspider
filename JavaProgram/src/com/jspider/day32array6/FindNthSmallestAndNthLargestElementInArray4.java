package com.jspider.day32array6;

import java.util.Arrays;

// WAP To Find Nth Smallest And Nth Largest Element in Array
// Duplicate Element is Also Present in Array
public class FindNthSmallestAndNthLargestElementInArray4 {
	public static void main(String[] args) {
		int[] a = { 10, 2, 10, 3, 20 };

		int b[] = removeDuplicate(a);
		System.out.println(Arrays.toString(b));

		int n = 0;
		find(b, n);

	}

	private static int[] removeDuplicate(int[] a) {
		// by default it is having false
		boolean bool[] = new boolean[a.length];

		int b[] = new int[a.length];
		int in = 0;

		for (int i = 0; i <= a.length - 1; i++) {
			if (bool[i] == false) {
				int cnt = 1;
				// either we can start j=0 and i!=j
				for (int j = i + 1; j <= a.length - 1; j++) {
					if (a[i] == a[j]) {
//								a[j] = -1;
						bool[j] = true;
						cnt++;
					}
				}
				b[in] = a[i];
				in++;
			}
		}
		return b;
	}

	private static void find(int[] b, int n) {
		for (int i = 0; i <= b.length - 1; i++) {
			int c = 0;
			for (int j = 0; j <= b.length - 1; j++) {
				if (b[i] < b[j]) {
					c++;
				}
			}
			if (c == b.length - n) {
				System.out.println(b[i]);
				break;
			}
		}
	}
}
