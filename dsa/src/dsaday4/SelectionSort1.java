package dsaday4;

import java.util.Arrays;

public class SelectionSort1 {
	static void sort(int[] arr) {
		for (int i = 0; i <= arr.length - 1; i++) {
			// firstly find small in right side
			int minIndex = i;
			for (int j = i + 1; j <= arr.length - 1; j++) {
				if (arr[minIndex] > arr[j]) {
					minIndex = j;
				}

			}
//			than swap that with current i
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
//			System.out.println(Arrays.toString(arr));
		}

	}

	public static void main(String[] args) {
		int[] arr = { 5, 4, 2, 6, 1, 3 };
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}

//[1, 4, 2, 6, 5, 3]
//[1, 2, 4, 6, 5, 3]
//[1, 2, 3, 6, 5, 4]
//[1, 2, 3, 4, 5, 6]
//[1, 2, 3, 4, 5, 6]
//[1, 2, 3, 4, 5, 6]
