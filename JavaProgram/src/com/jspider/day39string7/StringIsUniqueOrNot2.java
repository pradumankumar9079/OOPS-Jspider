package com.jspider.day39string7;

// WAP To find String is Unique or not
// My Way Using HashSet 
// Sir Way Next File StringIsUniqueOrNot2_1

// Handle All Case
import java.util.HashSet;

public class StringIsUniqueOrNot2 {
	public static void main(String[] args) {
		String s = "abcd";
		s = s.toLowerCase();

		if (isUnique(s)) {
			System.out.println("Is Unique");
		} else {
			System.out.println("Not Unique");
		}

	}

	private static boolean isUnique(String s) {
		HashSet<Character> hs = new HashSet<Character>();
		for (int i = 0; i <= s.length() - 1; i++) {
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				hs.add(s.charAt(i));
			}
		}
		if (hs.size() < s.length()) {
			return false;
		} else {
			return true;
		}
	}
}
//Is Unique
