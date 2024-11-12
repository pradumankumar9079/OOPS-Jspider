package com.jspider.day38string6;

// WAP To Reverse Each Word In String in same place Sir Way
public class ReverseEachWordInSentenceSirWay3 {
	public static void main(String[] args) {
		String s = "ram is good";

		String x[] = s.split(" ");

		String mainStr = "";
		for (int i = 0; i <= x.length - 1; i++) {
			String t = x[i];
			String rev = reverse(t);
			mainStr = mainStr + rev + " ";
		}
		System.out.println(mainStr);
	}

	private static String reverse(String t) {
		String rev = "";
		for (int i = t.length() - 1; i >= 0; i--) {
			char ch = t.charAt(i);
			rev = rev + ch;
		}
		return rev;
	}
}
//mar si doog 
