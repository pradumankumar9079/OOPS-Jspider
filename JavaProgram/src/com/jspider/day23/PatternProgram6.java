package com.jspider.day23;

/*
0 1 0 1 0 
1 0 1 0 1 
0 1 0 1 0 
1 0 1 0 1 
0 1 0 1 0 
*/

// First Logic
//public class PatternProgram6 {
//	public static void main(String[] args) {
//		int n = 5;
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= n; j++) {
//				// it will also work
////				if sum even print 1 else 0
////				if ((i + j) % 2 == 0) {
////					System.out.print(1 + " ");
////				} else {
////					System.out.print(0 + " ");
////				}
//				System.out.print(1-(i + j) % 2 + "   ");
//			}
//			System.out.println();
//		}
//	}
//}

// Logic 2

public class PatternProgram6 {
	public static void main(String[] args) {
//		Taking one extra variable
		int n = 5;
		int x = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(x % 2 + " ");
				x++;
			}
			System.out.println();
		}
	}
}
