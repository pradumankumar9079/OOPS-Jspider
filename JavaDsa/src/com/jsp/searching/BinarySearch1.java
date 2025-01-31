package com.jsp.searching;

public class BinarySearch1 {
	public static void main(String[] args) {
		int arr[] = { 21, 22, 23, 24, 25, 26 };
		int key = 22;
		int res = binarySearch(arr, key);
		System.out.println("Element Found At index:" + res);

	}

	public static int binarySearch(int arr[], int key) {
		int si = 0;
		int ei = arr.length - 1;
		while (si <= ei) {
			int mid = si + (ei - si) / 2;
			if (arr[mid] == key) {
				return mid;
			} else if (arr[mid] < key) {
				si = mid + 1;
			} else {
				ei = mid - 1;
			}
		}
		return -1;
	}
}
