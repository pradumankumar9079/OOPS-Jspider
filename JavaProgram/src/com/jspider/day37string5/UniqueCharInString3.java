package com.jspider.day37string5;

// WAP To Find Unique Character In Given String
public class UniqueCharInString3 {
	public static void main(String[] args) {
		String s = "gadag";
		char ch[] = s.toCharArray();

		boolean[] b = new boolean[ch.length];

		for (int i = 0; i <= ch.length - 1; i++) {

			int cnt = 1;
			if (b[i] == false) {
				for (int j = i + 1; j <= ch.length - 1; j++) {
					if (ch[i] == ch[j]) {
						cnt++;
						b[j] = true;
					}
				}

				// Checking Character is Having Only One Occurrence or not

				if (cnt == 1) {
					System.out.println(ch[i] + "--" + cnt);
				}
			}

		}
	}
}
//d--1
