package com.jspider.day23pattern1;

/*
5 4 3 2 1 
5 4 3 2 1 
5 4 3 2 1 
5 4 3 2 1 
5 4 3 2 1 
*/
public class PatternProgram10 {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
