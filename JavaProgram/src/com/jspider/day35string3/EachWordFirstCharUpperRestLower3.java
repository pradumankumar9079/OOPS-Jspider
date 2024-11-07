package com.jspider.day35string3;

// WAP To Convert Each Word First Character into Upper Rest Char into Lower
// Same as count Number of Words in String logic

public class EachWordFirstCharUpperRestLower3 {
	public static void main(String[] args) {
		String s = "rAm  iS a  gOOD bOY1";
		char[] ch = s.toCharArray();

		for (int i = 0; i <= ch.length - 1; i++) {
			if (i == 0 && ch[i] != ' ' || ch[i] != ' ' && ch[i - 1] == ' ') {
				if (ch[i] >= 'a' && ch[i] <= 'z') {
					ch[i] = (char) (ch[i] - 32);
				}
			} else {
				if (ch[i] >= 'A' && ch[i] <= 'Z') {
					ch[i] = (char) (ch[i] + 32);
				}
			}
		}
		System.out.println(new String(ch));
	}
}
