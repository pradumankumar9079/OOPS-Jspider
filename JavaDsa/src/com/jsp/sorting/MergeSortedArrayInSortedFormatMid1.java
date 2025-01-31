package com.jsp.sorting;

import java.util.Arrays;

public class MergeSortedArrayInSortedFormatMid1 {

	public static void main(String[] args) {
		int arr[] = { 25, 1, 5, 12, 16, 20, 3, 7, 9, 13, 30, 4 };
		int l = 2;
		int h = 9;
		int m = arr.length / 2;
		merge(arr, l, h, m);
		System.out.println(Arrays.toString(arr));
	}

	private static void merge(int arr[], int l, int h, int m) {
		int[] L = new int[m - l + 1];
		int[] R = new int[h - m];
		int x = 0;

		for (int i = l; i <= m; i++) {
			L[x++] = arr[i];
		}
		System.out.println(Arrays.toString(L));
		x = 0;
		for (int i = m + 1; i <= h; i++) {
			R[x++] = arr[i];
		}
		System.out.println(Arrays.toString(R));

		// merging in older array in sorted format
		int k = l;
		int i = 0;
		int j = 0;
		while (i < L.length && j < R.length) {
			if (L[i] < R[j]) {
				arr[k] = L[i];
				k++;
				i++;
			} else {
				arr[k] = R[j];
				k++;
				j++;
			}
		}
		while (i < L.length) {
			arr[k] = L[i];
			k++;
			i++;
		}
		while (j < R.length) {
			arr[k] = R[j];
			k++;
			j++;
		}
	}
}
