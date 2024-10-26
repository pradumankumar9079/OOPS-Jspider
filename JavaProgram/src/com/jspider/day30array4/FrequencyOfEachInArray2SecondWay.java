package com.jspider.day30array4;

//recommanded logic for finding frequency
public class FrequencyOfEachInArray2SecondWay {
	public static void main(String[] args) {
		int x[] = { 10, 20, 30, 20, -1 };

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
				System.out.println(x[i] + "-" + cnt);
			}
		}
	}
}
