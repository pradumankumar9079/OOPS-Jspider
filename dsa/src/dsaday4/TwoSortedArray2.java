package dsaday4;

import java.util.Arrays;

// merge two sorted arri in sorter manner TC:O(n)

// it will work only for sorted array
public class TwoSortedArray2 {

	public static void main(String[] args) {
		int[] arr1 = { 3, 11, 14, 16 };
		int[] arr2 = { 2, 7, 12 };

		int[] res = mergeSortedArrayInSortedManner(arr1, arr2);

		System.out.println(Arrays.toString(res));
	}

	private static int[] mergeSortedArrayInSortedManner(int[] arr1, int[] arr2) {
		// Creating new Array to merge
		int[] res = new int[arr1.length + arr2.length];
		int i = 0;
		int j = 0;
		int k = 0;
		// Running this while until one of them is exhausted
		while (i <= arr1.length - 1 && j <= arr2.length - 1) {
			if (arr1[i] < arr2[j]) {
				res[k] = arr1[i];
				i++;
			} else {
				res[k] = arr2[j];
				j++;
			}
			k++;
		}

		// check for remain in arr1
		while (i <= arr1.length - 1) {
			res[k] = arr1[i];
			i++;
			k++;
		}

		// check for remain in arr2
		while (j <= arr2.length - 1) {
			res[k] = arr2[k];
			j++;
			k++;
		}
		return res;
	}
}
