package com.jspider.day39string7;

//WAP To find String is Unique or not
// Solve for number
// Sir Way

public class StringIsUniqueOrNot2_1 {
	public static void main(String[] args) {
		String s = "abccd";
		if (isUnique(s)) {
			System.out.println("Is Unique");
		} else {
			System.out.println("Not Unique");
		}
	}

	private static boolean isUnique(String s) {
		for (int i = 0; i <= s.length() - 1; i++) {
			for (int j = i + 1; j <= s.length() - 1; j++) {
				if (s.charAt(i) == s.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}
}
//Not Unique
