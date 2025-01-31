package com.jsp.sorting;

import java.util.Arrays;

//TC--> O(n^2)
// Total arr.length-1 number of turn or we can say pass
//In Bubble Sort, a pass refers to one complete iteration through the array, where adjacent elements are compared and swapped if necessary.
//
//For example, in the first pass, the largest element bubbles up to its correct position at the end of the array. In the second pass, the second-largest element is placed correctly, and so on. The sorting process continues until the array is fully sorted.

public class BubbleSort1 {
	public static void main(String[] args) {
		int arr[] = { 5, 4, 1, 3, 2 };
		// 2 4 1 3 5

		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void bubbleSort(int arr[]) {
		for (int turn = 0; turn < arr.length - 1; turn++) {
			for (int j = 0; j < arr.length - 1 - turn; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
}
