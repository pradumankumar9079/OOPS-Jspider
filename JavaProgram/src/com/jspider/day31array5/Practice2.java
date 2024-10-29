package com.jspider.day31array5;

import java.util.Arrays;

//Delete an element from an Array
public class Practice2 {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		int index = 2;
		int res[] = delete(a, index);
		System.out.println(Arrays.toString(res));
	}

	private static int[] delete(int[] a, int index) {
		int[] newArr = new int[a.length - 1];
		for (int i = 0; i <= a.length - 1; i++) {
			if (i < index) {
				newArr[i] = a[i];
			} else if (i > index) {
				newArr[i - 1] = a[i];
			}
		}
		return newArr;
	}
}
