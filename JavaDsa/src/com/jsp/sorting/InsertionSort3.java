package com.jsp.sorting;

import java.util.Arrays;

// Insertion Sort
// inspiration comes with card 1 2 3 5 4--> pick 4 and put it in sorted part 1 2 3 5
// Pick an Element(from unsorted part) & place in the right pos in sorted part
public class InsertionSort3 {
	public static void main(String[] args) {
		int arr[] = { 5, 4, 1, 3, 2 };
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void insertionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int curr = arr[i];
			int prev = i - 1;

			// finding out the correct pos to insert
			while (prev >= 0 && arr[prev] > curr) {
				arr[prev + 1] = arr[prev];
				prev--;
			}

			// insertion
			arr[prev + 1] = curr;
		}
	}
}
