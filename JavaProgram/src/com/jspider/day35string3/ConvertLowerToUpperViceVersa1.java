package com.jspider.day35string3;

// WAP To Convert Lower Case To UpperCase and Vice Versa
public class ConvertLowerToUpperViceVersa1 {

	public static void main(String[] args) {
		String s = "Raja raj3";

		String res = "";
		for (int i = 0; i <= s.length() - 1; i++) {
			char ch = s.charAt(i);

			if (ch >= 'A' && ch <= 'Z') {
				res = res + (char) (ch + 32);
			} else if (ch >= 'a' && ch <= 'z') {
				res = res + (char) (ch - 32);
			} else {
				res = res + (char) ch;
			}
		}
		System.out.println(res);
	}
}
// or we can Use s = s.toUpperCase() and Vice Versa for Complete String
//rAJA RAJ3
