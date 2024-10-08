package com.jspider.day23;

/*
 * for pattern program
 * ask how many column in each row
 * than ask row wise or column wise we are printing same value
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
*/
public class PatternProgram12 {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
