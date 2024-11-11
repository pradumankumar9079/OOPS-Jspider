package com.jspider.day37string5;

// WAP To Sort String in Ascending order
// Sorting Perform Based On ASCII Value

public class SortStringInAscending1 {
	public static void main(String[] args) {
		String s = "ramesh";
		char[] ch = s.toCharArray();

		for (int i = 0; i <= ch.length - 1; i++) {
			// if i will start j from 0 it will give descending order rather ascending
			for (int j = i + 1; j <= ch.length - 1; j++) {
				if (ch[i] > ch[j]) {
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}

		// Again Converting into String
		String s1 = new String(ch);
		System.out.println(s1);
	}
}
//aehmrs
