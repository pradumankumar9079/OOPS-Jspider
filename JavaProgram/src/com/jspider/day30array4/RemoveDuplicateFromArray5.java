package com.jspider.day30array4;

// Complete it something like count we have to play with
// Remove Duplicate From Array-->Print it only
public class RemoveDuplicateFromArray5 {
	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 10 };
		boolean b[] = new boolean[a.length];

//		int newArr[] = new int[a.length];
		for (int i = 0; i <= a.length - 1; i++) {
			int cnt = 1;
			if (b[i] == false) {
				for (int j = i + 1; j <= a.length - 1; j++) {
					if (a[i] == a[j]) {
						cnt++;
						b[j] = true;
					}
//					newArr[i] = a[i];
					System.out.println(a[j] + '-' + cnt);

				}
			}
//		System.out.println(Arrays.toString(newArr));
		}
	}
}
