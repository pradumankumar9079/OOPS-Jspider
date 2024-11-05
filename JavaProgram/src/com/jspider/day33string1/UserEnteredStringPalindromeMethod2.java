package com.jspider.day33string1;

// WAP To Check String is Palindrome or not Using Two Pointer Apporach
public class UserEnteredStringPalindromeMethod2 {
	public static void main(String[] args) {
		String str = "gadag";

		if (isPalindrome(str)) {
			System.out.println("Is Palindrome");
		} else {
			System.out.println("Is Not Palindrome");
		}
	}

	private static boolean isPalindrome(String str) {
		// Using Two Pointer Approach-->Recommended Approach
		int i = 0;
		int j = str.length() - 1;

		// This will also work
//		boolean flag = true;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j)) {
//				flag = false;
//				break;
				return false;

			}
			i++;
			j--;
		}
//		return flag;
		return true;
	}
}
