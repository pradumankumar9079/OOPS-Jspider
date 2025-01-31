package com.jsp.sorting;

import java.util.Arrays;

// Selection Sort
//TC-->O(n)^2
// Better than bubble no each time swap required

//The Selection Sort algorithm is a simple and intuitive sorting algorithm that works by repeatedly selecting the smallest (or largest) element from the unsorted part of the array and swapping it with the first unsorted element. It has a time complexity of O(n²) in all cases.
//
//Selection Sort Algorithm
//Start with the first element and assume it is the smallest.
//Compare it with the rest of the elements to find the smallest element.
//Swap the smallest element with the first element.
//Move to the next element and repeat the process for the remaining elements.
//Continue this until the entire array is sorted.

public class SelectionSort2 {
	public static void main(String[] args) {

		int arr[] = { 5, 4, 1, 3, 2 };
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int minPos = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[minPos] > arr[j]) {
					minPos = j;
				}
			}

			// swap
			int temp = arr[minPos];
			arr[minPos] = arr[i];
			arr[i] = temp;

		}
	}

}
