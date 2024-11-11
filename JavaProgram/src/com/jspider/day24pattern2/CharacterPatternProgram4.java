package com.jspider.day24pattern2;

/*
    A
   ABC
  ABCDE
 ABCDEFG
ABCDEFGHI
*/
public class CharacterPatternProgram4 {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			char ch = 'A';
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(ch);
				ch++;
			}
			for (int l = 1; l <= i - 1; l++) {
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
	}
}
