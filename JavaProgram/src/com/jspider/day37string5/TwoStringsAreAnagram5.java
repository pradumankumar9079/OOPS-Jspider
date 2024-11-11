package com.jspider.day37string5;

import java.util.Arrays;

public class TwoStringsAreAnagram5 {
	public static void main(String[] args) {
		String s1 = "caat";
		String s2 = "aact";
		if (isAnagram(s1, s2)) {
			System.out.println("Is Anagram");
		} else {
			System.out.println("Is Not Anagram");
		}
	}

	/************************* Sir Way *******************/

	private static boolean isAnagram(String s1, String s2) {
		char ch1[] = s1.toCharArray();
		// Don't Have Inbuilt function to Sort The Array
		// So Converting into Character Array Use Arrays.sort(arrName)

		Arrays.sort(ch1);
		s1 = new String(ch1);

		char ch2[] = s2.toCharArray();
		Arrays.sort(ch2);
		s2 = new String(ch2);

		// In Array Equals Method is Not Overridden--> So Convert Into String
		// ch1.equals(ch2)--> Compairing Address

//		if (s1.equals(s2)) {
//			return true;
//		}
//
//		return false;

		return s1.equals(s2);
	}

	/*************************** My Way **************************/
//	private static boolean isAnagram(String s1, String s2) {
//		if (s1.length() != s2.length()) {
//			return false;
//		}
//		char ch1[] = s1.toCharArray();
//		char ch2[] = s2.toCharArray();
//
//		boolean b[] = new boolean[ch1.length];
//		boolean c[] = new boolean[ch2.length];
//
//		for (int i = 0; i <= ch1.length - 1; i++) {
//			int cnt = 1;
//			if (b[i] == false && c[i] == false) {
//				for (int j = i + 1; j <= ch1.length - 1; j++) {
//					if (ch1[i] == ch1[j]) {
//						cnt++;
//						b[j] = true;
//					}
//					if (ch2[i] == ch2[j]) {
//						cnt--;
//						c[j] = true;
//					}
//					if (cnt == 1) {
//						return true;
//					}
//				}
//
//			}
//		}
//
//		return false;
//	}
}
//Is Anagram
