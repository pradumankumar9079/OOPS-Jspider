package practice;

import java.util.Arrays;

public class MainClass1 {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4 };
		int[] res = insertArray(a, 2);
		System.out.println(Arrays.toString(res));
	}

	private static int[] insertArray(int[] a, int index) {
		int[] b = new int[a.length + 1];

		b[index] = 2;
		int k = 0;
		for (int i = 0; i <= a.length - 1; i++) {
			if (i < index) {
				b[i] = a[i];
			} else if (i >= index) {
				b[i + 1] = a[i];
			}
		}

		return b;
	}
}
