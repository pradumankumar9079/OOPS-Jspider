package com.jspider.day36string4;

// WAP To Swap Each Word First Character with last Character
// First Char Capture
// Capture Last Char--> Than Perform swap inside last char loop

public class SwapEachWordFirstCharWithLastChar2 {

	public static void main(String[] args) {
		String s = "rAm  iS a  gOOD bOY1";
		char[] ch = s.toCharArray();

		int indexFirst = 0;
		for (int i = 0; i <= ch.length - 1; i++) {
			if (i == 0 && ch[i] != ' ' || ch[i] != ' ' && ch[i - 1] == ' ') {
				indexFirst = i;
//				System.out.println(ch[i]);
			} else if (i == ch.length - 1 && ch[i] != ' ' || ch[i] != ' ' && ch[i + 1] == ' ') {
				char tempCh = ch[indexFirst];
				ch[indexFirst] = ch[i];
				ch[i] = tempCh;
//				System.out.println(ch[i]);
			}

		}
		System.out.println(ch);
	}
}

//mAr  Si a  DOOg 1OYb
