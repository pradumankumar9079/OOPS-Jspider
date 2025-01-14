package dsaday2;

// pass by value(Other than array)--> it means passing copy of that, pass by reference(array)--> means it's passing real array

public class BubbleSort1 {
	public static void sort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 100, 5, 2, 1, 3 };
		sort(arr);
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}
}
