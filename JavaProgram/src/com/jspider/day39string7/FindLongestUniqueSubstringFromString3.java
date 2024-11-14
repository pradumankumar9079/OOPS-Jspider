package com.jspider.day39string7;

// WAP To Find unique Unique Substring From String

public class FindLongestUniqueSubstringFromString3 {
	public static void main(String[] args) {
		String s = "abcdambhid";
		String unique = "";
		int len = 0;

		for (int i = 0; i <= s.length() - 1; i++) {
			for (int j = i + 1; j <= s.length(); j++) {

				// substring() is built in method not including last index here

				String sub = s.substring(i, j);
//				System.out.println(sub);
				// Only Change is method isUnique
				if (isUnique(sub)) {
					if (sub.length() > len) {
						len = sub.length();
						unique = sub;
//						System.out.println(sub);
					}
				}
			}
		}
		System.out.println(unique);
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
//cdambhi
