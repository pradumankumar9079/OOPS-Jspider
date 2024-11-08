package com.jspider.day30array4;

public class Practice {
	public static void main(String[] args) {

		// Merge Array
		/*
		 * int[] x = { 1, 2, 3, 4 }; int y[] = { 5, 6, 7, 8 };
		 * 
		 * int[] newArr = merge(x, y); System.out.println(Arrays.toString(newArr));
		 */

		// WAP To Print Frequency Of Each Element
		/*
		 * int[] x = { 1, 2, 3, 2, 1 };
		 * 
		 * boolean[] b = new boolean[x.length];// default 5 false
		 * 
		 * for (int i = 0; i <= x.length - 1; i++) {
		 * 
		 * int cnt = 1;
		 * 
		 * 
		 * for (int j = 0; j <= x.length - 1; j++) {
		 * 
		 * if (x[i] == x[j] && i != j) { cnt++; }
		 * 
		 * 
		 * 
		 * if (x[i] == x[j] && i != j) { cnt++; x[j] = -1; }
		 * 
		 * 
		 * 
		 * }
		 * 
		 * 
		 * 
		 * if (x[i] != -1) { System.out.println(x[i] + " " + cnt); }
		 * 
		 * 
		 * System.out.println(x[i] + " " + cnt);
		 * 
		 * 
		 * 
		 * for (int j = i + 1; j <= x.length - 1; j++) { if (x[i] == x[j]) { cnt++; x[j]
		 * = -1; } } if (x[i] != -1) { System.out.println(x[i] + " " + cnt); }
		 * 
		 * 
		 * if (b[i] == false) { for (int j = i + 1; j <= x.length - 1; j++) { if (x[i]
		 * == x[j]) { cnt++; b[j] = true; } }
		 * 
		 * System.out.println(x[i] + " " + cnt);
		 * 
		 * 
		 * if (cnt == 1) { System.out.println(x[i] + " " + cnt); }
		 * 
		 * 
		 * 
		 * if (cnt > 1) { System.out.println(x[i] + " " + cnt); }
		 * 
		 * }
		 * 
		 * }
		 */

		// WAP TO Remove Duplicate From Array
		/*
		 * int[] x = { 1, 2, 3, 2, 1 };
		 * 
		 * int[] arrayAfterRemove = removeDuplicate(x);
		 * System.out.println(Arrays.toString(arrayAfterRemove));
		 */

		// WAP To Print pair element whose sum is equal to given number
		/*
		 * int[] x = { 1, 2, 3, 2, 1 }; int targetSum = 4;
		 * 
		 * for (int i = 0; i <= x.length - 1; i++) { for (int j = i + 1; j <= x.length -
		 * 1; j++) { if (x[i] + x[j] == targetSum) { System.out.println("(" + x[i] + ","
		 * + x[j] + ")"); } } }
		 */

	}

	private static int[] removeDuplicate(int[] x) {
		int[] newArr = new int[x.length];
		boolean b[] = new boolean[x.length];

		for (int i = 0; i <= x.length - 1; i++) {
			int cnt = 1;
			if (b[i] == false) {
				for (int j = i + 1; j <= x.length - 1; j++) {
					if (x[i] == x[j]) {
						cnt++;
						b[j] = true;
					}
				}
				if (cnt == 1) {
					newArr[i] = x[i];
				}
			}
		}
		return newArr;
	}

	private static int[] merge(int[] x, int[] y) {
		int sizeOfNewArr = x.length + y.length;
		int[] newArr = new int[sizeOfNewArr];

		for (int i = 0; i <= x.length - 1; i++) {
			newArr[i] = x[i];
		}
		for (int j = 0; j <= y.length - 1; j++) {
			newArr[x.length + j] = y[j];
		}
		return newArr;
	}
}
