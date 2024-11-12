package com.jspider.day38string6;

// WAP To Reverse a Sentence-->Sir Way go to ReverseASentenceSirWay
//eg:- "ram is good"
// --> good is ram
// these type of question solution other using inbuilt method split
// step1: I Know How To Find first and last char in array
// step2: reverse word in Place 
// step3: than reverse whole String

public class ReverseASentence2 {
	public static void main(String[] args) {
		String s = "ram is good";
		char ch[] = s.toCharArray();

		int firstIndex = 0;
		String res = "";
		for (int i = 0; i <= ch.length - 1; i++) {
			// for first Character
			if (i == 0 && ch[i] != ' ' || ch[i - 1] == ' ' && ch[i] != ' ') {
				firstIndex = i;
			}

			// for last Character
			if (i == ch.length - 1 && ch[i] != ' ' || ch[i + 1] == ' ' && ch[i] != ' ') {
				for (int j = i; j >= firstIndex; j--) {
					res = res + ch[j];
				}
				if (i != ch.length - 1) {
					res += " ";
				}
			}
		}
		System.out.println(new StringBuffer(res).reverse());
	}
}
