package com.jspider.day23pattern1;

/*
1 1 1 1 1 
0 0 0 0 0 
1 1 1 1 1 
0 0 0 0 0 
1 1 1 1 1 
*/
// My Logic
//public class PatternProgram4 {
//	public static void main(String[] args) {
//		int n = 5;
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= n; j++) {
//				if (i % 2 != 0) {
//					System.out.print(1 + " ");
//				} else {
//					System.out.print(0 + " ");
//				}
//			}
//			System.out.println();
//		}
//	}
//}

// Sir Logic--> Without if else
public class PatternProgram4 {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(i % 2 + " ");
			}
			System.out.println();
		}
	}
}
