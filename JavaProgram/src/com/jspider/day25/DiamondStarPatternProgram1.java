package com.jspider.day25;

/*
Enter Number:
n = 9
        * 
      * * * 
    * * * * * 
  * * * * * * * 
* * * * * * * * * 
  * * * * * * * 
    * * * * * 
      * * * 
        * 

*/

// Trace
//public class DiamondStarPatternProgram1 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Number: ");
//		int n = sc.nextInt();
//		int sp = n / 2, st = 1;
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= sp; j++) {
//				System.out.print("  ");
//			}
//			for (int k = 1; k <= st; k++) {
//				System.out.print("* ");
//			}
//			if (i <= n / 2) {
//				sp--;
//				st = st + 2;
//			} else {
//				sp++;
//				st = st - 2;
//			}
//			System.out.println();
//		}
//	}
//}

// My Way try
public class DiamondStarPatternProgram1 {
	public static void main(String[] args) {
		int n = 7;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			for (int l = 1; l <= i - 1; l++) {
				System.out.print("* ");
			}

			System.out.println();
		}
		for (int i = 1; i <= (n / 2) - 1; i++) {
			for (int j = 1; j <= i - 1; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k <= (n / 2) - i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}