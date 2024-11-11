package com.jspider.day24pattern2;

/*
A
AB
ABC
ABCD
ABCDE
*/
// My Way
//public class CharacterPatternProgram1 {
//	public static void main(String[] args) {
//		int n = 5;
//		for (int i = 1; i <= n; i++) {
//			char ch = 'A';
//			for (int j = 1; j <= i; j++) {
//				System.out.print(ch);
//				ch++;
//			}
//			System.out.println();
//		}
//	}
//}

// Sir Way
public class CharacterPatternProgram1 {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((char) (j + 64) + " ");
			}
			System.out.println();
		}
	}
}