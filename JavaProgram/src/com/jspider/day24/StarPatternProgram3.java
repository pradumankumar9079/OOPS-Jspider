package com.jspider.day24;

//Pyramid --> Not Triangle

/*
    *    
   ***   
  *****  
 ******* 
*********
*/
// My Way
//public class StarPatternProgram3 {
//	public static void main(String[] args) {
//		int n = 5;
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= n - i; j++) {
//				System.out.print(" ");
//			}
//			for (int k = 1; k <= i; k++) {
//				System.out.print("*");
//			}
//			for (int k = 1; k <= i - 1; k++) {
//				System.out.print("*");
//			}
//			for (int j = 1; j <= n - i; j++) {
//				System.out.print(" ");
//			}
//			System.out.println();
//		}
//	}
//}

//Sir Way --> Without using extra variable
//int k = 1; k <= 2 * i - 1; k++--Important
//public class StarPatternProgram3 {
//	public static void main(String[] args) {
//		int n = 5;
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= n - i; j++) {
//				System.out.print(" ");
//			}
//			for (int k = 1; k <= 2 * i - 1; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}
//}

// Sir Way --> Using Extra Variable
public class StarPatternProgram3 {
	public static void main(String[] args) {
		int n = 5;
		int sp = n - 1;
		int st = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - 1; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= st; k++) {
				System.out.print("*");
			}
			st = st + 2;
			sp--;
			System.out.println();
		}
	}
}