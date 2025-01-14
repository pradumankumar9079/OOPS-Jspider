package dsaday1;

import java.util.Scanner;

// O(log n) time complexity here better than O(n) linear search
// in two pointer approach always start<=end
// in sorted array we can only apply binary search
// Check algorithm in note
// Best Complexity of Binary Search is: O(1)-->Key at middle
// Worst Complexity of Binary Search is: O(log n)--> key not found
//key present at extreme
public class BinarySearch1 {
	public static int binarySearch(int[] arr, int key) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (key == arr[mid]) {
				return mid;
			} else if (arr[mid] > key) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter key u wanna search: ");
		int key = sc.nextInt();
		int res = binarySearch(arr, key);
		if (res == -1) {
			System.out.println("Element Does Not Exist");
		} else {
			System.out.println("Element Present at index: " + res);
		}
	}
}
