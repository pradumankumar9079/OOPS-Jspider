package com.jspider.day39string7;

// WAP To Find Longest Palindromic Substring
// Always End(Use This) Index Will be end-1 internally; // for substring() method

/*******************************************/
// it's work like
//0,1
//0,2
//.....
// than
// 1,2
//1,3
//...
/*******************************************/

public class FindLongestPalindromeSubstringInAString1 {
	public static void main(String[] args) {
		String s = "ababakhhkama";
		String longest = "";
		int len = Integer.MIN_VALUE;

		for (int i = 0; i <= s.length() - 1; i++) {
			for (int j = i + 1; j <= s.length(); j++) {

				// substring() is built in method not including last index here

				String sub = s.substring(i, j);
//				System.out.println(sub);
				if (isPalindrome(sub)) {
					if (sub.length() > len) {
						len = sub.length();
						longest = sub;
						System.out.println(longest);
					}
				}
			}
		}
		// System.out.println(longest);
	}

	private static boolean isPalindrome(String sub) {
		int i = 0;
		int j = sub.length() - 1;
		while (i < j) {
			if (sub.charAt(i) != sub.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
//akhhka
