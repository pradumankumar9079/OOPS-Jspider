package com.jspider.day38string6;

import java.util.HashSet;

// WAP To Check String is Panagram or Not
// Definition: - it should Contain all 26 Character at least Once
// Using HashSet

public class CheckStringisPanagram1 {
	public static void main(String[] args) {
		String s = "abcdef@ghijklmnopqrstuvwyzXz";
		s = s.toLowerCase();
		if (isPanagram(s)) {
			System.out.println("Is Panagram");
		} else {
			System.out.println("Is Not Panagram");
		}
	}

	private static boolean isPanagram(String s) {
//		if (s.length() < 26) {
//			return false;
//		}

		// It will not allow Duplicate Value
		HashSet<Character> hs = new HashSet<Character>();
		for (int i = 0; i <= s.length() - 1; i++) {
			char ch = s.charAt(i);
			// to add Character to hashSet use hs.add() method

			/****************************************/
			// if we have symbol as well
			// abcd@fghijklmnopqrstuvwxyzz
			if (ch >= 'a' && ch <= 'z') {
				hs.add(ch);
			}
			/****************************************/
		}
		/********************************************/
		// it's not printing address because in hashSet Class toString() method is
		// Overrided So Printing Content
//		System.out.println(hs);
		/********************************************/

		// don't have length had size()
		if (hs.size() == 26) {
			return true;
		} else {
			return false;
		}
	}
}
