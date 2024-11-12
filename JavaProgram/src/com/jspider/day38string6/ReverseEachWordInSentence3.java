package com.jspider.day38string6;

// WAP To Reverse Each Word In String in same place My Way
// eg: "ram is good"
// "mar si doog"

public class ReverseEachWordInSentence3 {
	public static void main(String[] args) {
		String s = "ram is good";
		char[] ch = s.toCharArray();

		String res = "";
		int firstIndex = 0;
		for (int i = 0; i <= ch.length - 1; i++) {
			if (i == 0 && ch[i] != ' ' || ch[i - 1] == ' ' && ch[i] != ' ') {
				firstIndex = i;
			}
			if (i == ch.length - 1 && ch[i] != ' ' || ch[i + 1] == ' ' && ch[i] != ' ') {
				for (int j = i; j >= firstIndex; j--) {
					res = res + ch[j];
				}
				if (i != 0 || i != ch.length - 1) {
					res += " ";
				}
			}
		}
		System.out.println(res);
	}
}
//mar si doog 
