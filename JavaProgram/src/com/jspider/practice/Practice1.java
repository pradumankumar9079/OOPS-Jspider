package com.jspider.practice;

// Reverse Each Word in a Sentence
public class Practice1 {
	public static void main(String[] args) {
		String s = "ram is good";
		char[] ch = s.toCharArray();
		int firstIndex = 0;
		for (int i = 0; i <= s.length() - 1; i++) {
			if (i == 0 && ch[i] != ' ' || ch[i] != ' ' && ch[i - 1] == ' ') {
				firstIndex = i;
			}
			if (i == ch.length - 1 && ch[i] != ' ' || ch[i] != ' ' && ch[i + 1] == ' ') {
				char temp = ch[firstIndex];
				ch[firstIndex] = ch[i];
				ch[i] = temp;
			}
		}
		System.out.println(ch);
	}
}
