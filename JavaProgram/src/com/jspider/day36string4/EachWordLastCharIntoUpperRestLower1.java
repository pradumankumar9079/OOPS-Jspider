package com.jspider.day36string4;

// WAP to  convert Each Word Last Character into Upper Rest Lower

// String Manipulation Not Possible That's Why Using To Char Array
// i am also handling i==0  and use as start of if because doing i-1
// Logic is like this: 
// stept 1: Capturing Last Char with if than performing some operation
// step 2: for rest of Character Use Else Block Perform Some Kind Of Operation

public class EachWordLastCharIntoUpperRestLower1 {
	public static void main(String[] args) {
		String s = "ram is a GOOD Boy3";
		char[] ch = s.toCharArray();

		for (int i = 0; i <= ch.length - 1; i++) {
			if (i == ch.length - 1 && ch[i] != ' ' || ch[i + 1] == ' ' && ch[i] != ' ') {
				if (ch[i] >= 'a' && ch[i] <= 'z') {
					ch[i] = (char) (ch[i] - 32);
				}
			} else if (ch[i] >= 'A' && ch[i] <= 'Z') {
				ch[i] = (char) (ch[i] + 32);
			}
		}
		System.out.println(new String(ch));
	}
}
