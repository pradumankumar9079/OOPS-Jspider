package com.jspider.day38string6;

// WAP To Reverse a Sentence-->Sir Way
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
