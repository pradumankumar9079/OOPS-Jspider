package com.jspider.day35string3;

// WAP To Count How Many Number Of Words Present in the Given String
public class CountNumberOfWordsPresentInGivenString2 {
	public static void main(String[] args) {
		/***************** My Way ************************/
		// 5 or //6 with space also counted as word
		// drawback of split
		// split will return string array

		/*
		 * String s = "My Name is Raja raj"; String words[] = s.split(" ");
		 * System.out.println(words.length);
		 */

		/****************** Sir Way ***********************/
		// Logic:-
		// it will work for all cases
		// Convert into char Array
		// if current character is not space but previous is space it's a word
		// for first handling i==0 && ch[i]!=space

		// ch[i] != ' ' && ch[i - 1] == ' ' put at starting of else
		// we will get ArrayIndexOutOfBound

		String s = "   Ram      is a      Good Boy";
		char[] ch = s.toCharArray();
		int cnt = 0;

		for (int i = 0; i <= s.length() - 1; i++) {
			if (i == 0 && ch[i] != ' ' || ch[i] != ' ' && ch[i - 1] == ' ') {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
