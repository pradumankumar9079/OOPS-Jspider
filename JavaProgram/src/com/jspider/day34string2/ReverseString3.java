package com.jspider.day34string2;

// WAP To Reverse a String
// either Use toCharArray than Reverse
// or iterate from end
// we are not able to use two pointer
// stringbuilder we can use-->Learn

public class ReverseString3 {
	public static void main(String[] args) {
		/*
		 * String s = "Raja Bhai"; String rev = ""; for (int i = s.length() - 1; i >= 0;
		 * i--) { char ch = s.charAt(i); // rev = ch + rev;
		 * 
		 * // rev = rev + ch; rev += ch;
		 * 
		 * } System.out.println(rev);
		 */

		/*
		 * String s = "Raja Bhai"; StringBuffer sb = new StringBuffer(s); sb.reverse();
		 * // System.out.println(sb);--> it will also work but not a String type //
		 * System.out.println(sb.toString());
		 */

		/*
		 * // Two Pointer With String Builder
		 * 
		 * String s = "Raja bhai"; StringBuilder sb = new StringBuilder(s);
		 * 
		 * int i = 0; int j = sb.length() - 1;
		 * 
		 * while (i < j) { char ch = sb.charAt(i); sb.setCharAt(i, sb.charAt(j));
		 * sb.setCharAt(j, ch); i++; j--; } System.out.println(sb);
		 * 
		 */

		/*
		 * String s = "Raja bhai"; char[] chars = s.toCharArray(); // Convert the string
		 * to a character array
		 * 
		 * int i = 0; int j = chars.length - 1;
		 * 
		 * while (i < j) { // Swap characters at positions i and j char temp = chars[i];
		 * chars[i] = chars[j]; chars[j] = temp;
		 * 
		 * i++; j--; }
		 * 
		 * // Convert the character array back to a String String reversed = new
		 * String(chars); System.out.println(reversed); // Output: "iahb ajaR"
		 */
	}
}
