package com.jspider.day24pattern2;

/*
*****
****
***
**
*
*/
public class StarPatternProgram2 {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			int k = i;
			for (int j = n; j >= k; j--) {
				System.out.print("*");
			}
			k++;
			System.out.println();
		}
	}
}
