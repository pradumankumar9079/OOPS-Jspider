package com.jspider.day30array4;

public class Practice2 {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 2, 1 };
		boolean b[] = new boolean[a.length];
		for (int i = 0; i <= a.length - 1; i++) {
			int cnt = 1;

			if (b[i] == false) {
				for (int j = 0; j <= a.length - 1; j++) {
					if (a[i] == a[j] && i != j) {
//						a[j] = -1;
						b[j] = true;
						cnt++;
					}
				}
				if (cnt > 1) {
					System.out.println(a[i] + "-" + cnt);
				}
			}
		}
	}
}
