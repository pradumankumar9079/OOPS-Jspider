package dsaday11;

import java.util.Arrays;

public class MainClass1 {
	public static void main(String[] args) {
		int arr[] = { 8, 18, 5, 2, 16, 24, 7 };
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

// insertion sort code
	private static void sort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}

	}
}
