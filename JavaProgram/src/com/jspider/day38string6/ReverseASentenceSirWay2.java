package com.jspider.day38string6;

// WAP To Reverse a Sentence-->Sir Way
//In Java, when split(" ") encounters multiple consecutive spaces, it doesn’t include them as individual spaces in the output array. Instead, it inserts empty strings ("") to indicate "missing" elements where there were additional delimiters but no actual characters between them. This is due to how split() processes the delimiters:

public class ReverseASentenceSirWay2 {
	public static void main(String[] args) {
		String s = "ram  is good";
		// We Are Spliting the String based on the String
		String[] x = s.split(" ");

		// System.out.println(Arrays.toString(x));
		// System.out.println(x.length);
		// after spliting based on space we are getting string array
		// look a like: ["ram","is","good"]
		// iterate Each Word from last word than add into rev

		String rev = "";
		for (int i = x.length - 1; i >= 0; i--) {
			rev = rev + x[i] + " ";
			/**************************************************/
			// Check this one
//			// after each word putting space
//			if (i != 0 || i != x.length - 1) {
//				rev = rev + " ";
//			}
			/**************************************************/
		}
		System.out.println(rev);
	}
}
