package com.jsp.sorting;

import java.util.Arrays;

//TC-->o(nlog(n))
//SC---> O(n)--> extra space required
// it's depth first approach
// Approach
//step 1: Divide-->mid=si+(ei-si)/2 --> to prevent dataType OverFlow
//step 2: mergeSort(left)
//        mergeSort(right)
//(
// base si>ei
//	    si=ei(single element)
//)
//step 3: merge both sorted part
public class MergeSort4 {
	public static void main(String[] args) {
		int arr[] = { 6, 3, 9, 5, 2, 8, -2 };
		mergeSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	public static void mergeSort(int arr[], int si, int ei) {
		if (si >= ei) {
			return;
		}
		int mid = si + (ei - si) / 2;
		mergeSort(arr, si, mid);
		mergeSort(arr, mid + 1, ei);
		merge(arr, si, mid, ei);
	}

	public static void merge(int[] arr, int si, int mid, int ei) {
		int temp[] = new int[ei - si + 1];
		int i = si; // iterator for left part
		int j = mid + 1; // iterator for right part
		int k = 0;// iterator for temp arr
		while (i <= mid && j <= ei) {
			if (arr[i] < arr[j]) {
				temp[k] = arr[i];
				i++;
			} else {
				temp[k] = arr[j];
				j++;
			}
			k++;
		}
		// left part
		while (i <= mid) {
			temp[k] = arr[i];
			i++;
			k++;
		}

		// right part
		while (j <= ei) {
			temp[k] = arr[j];
			j++;
			k++;
		}

		// copy temp to original arr
		for (k = 0, i = si; k < temp.length; k++, i++) {
			arr[i] = temp[k];
		}
	}

}
