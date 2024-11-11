package com.jspider.day37string5;

// WAP To Find Frequency Of Each Character In Given String

public class FindFrequencyOfEachCharInString2 {
	public static void main(String[] args) {
		String s = "gadag";
		char ch[] = s.toCharArray();

		// Taking Boolean Array To Avoid Duplicate Element Frequency
		boolean[] b = new boolean[ch.length];

		for (int i = 0; i <= ch.length - 1; i++) {

			int cnt = 1;
			if (b[i] == false) {
				for (int j = i + 1; j <= ch.length - 1; j++) {
					if (ch[i] == ch[j]) {
						cnt++;
						b[j] = true;
					}
				}
				System.out.println(ch[i] + "--" + cnt);
			}

		}
	}
}
//g--2
//a--2
//d--1
