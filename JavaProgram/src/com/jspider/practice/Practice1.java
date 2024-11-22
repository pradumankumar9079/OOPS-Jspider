package com.jspider.practice;

// Reverse Each Word in a Sentence
public class Practice1 {
	public static void main(String[] args) {
		String s = "rgham i69s gopk0d";
		char[] ch = s.toCharArray();
		int firstIndex = 0;
		for (int i = 0; i <= s.length() - 1; i++) {
			if (i == 0 && ch[i] != ' ' || ch[i] != ' ' && ch[i - 1] == ' ') {
				firstIndex = i;
			}
			if (i == ch.length - 1 && ch[i] != ' ' || ch[i] != ' ' && ch[i + 1] == ' ') {
				int fi = firstIndex;
				int li = i;
				while (fi <= li) {
					char temp = ch[fi];
					ch[fi] = ch[li];
					ch[li] = temp;
					fi++;
					li--;
				}
			}
		}
		System.out.println(ch);
	}
}
