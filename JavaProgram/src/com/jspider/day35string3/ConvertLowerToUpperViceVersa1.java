package com.jspider.day35string3;

// WAP To Convert Lower Case To UpperCase and Vice Versa
public class ConvertLowerToUpperViceVersa1 {

	public static void main(String[] args) {
		String s = "Raja raj3";

		/*********************** My Way ***********************/
		// here we are doing ASCII+32 so Convert into char
		// in case of number add ch directly

		/*
		 * String res = ""; for (int i = 0; i <= s.length() - 1; i++) { char ch =
		 * s.charAt(i);
		 * 
		 * if (ch >= 'A' && ch <= 'Z') { res = res + (char) (ch + 32); } else if (ch >=
		 * 'a' && ch <= 'z') { res = res + (char) (ch - 32); } else { res = res + (char)
		 * ch; } } System.out.println(res);
		 */

		/********************** Sir Way ***************************/
		// Until not performing operation it's still char else ASCII
		// by converting into toCharArray();
		// it will work without handling integer inside array
		// because i am making changes into same array
		char ch[] = s.toCharArray();

		for (int i = 0; i <= ch.length - 1; i++) {
			if (ch[i] >= 'A' && ch[i] <= 'Z') {
				ch[i] = (char) (ch[i] + 32);
			} else if (ch[i] >= 'a' && ch[i] <= 'z') {
				ch[i] = (char) (ch[i] - 32);
			}
		}
		System.out.println(new String(ch));

	}
}

// or we can Use s = s.toUpperCase() and Vice Versa for Complete String
//rAJA RAJ3
