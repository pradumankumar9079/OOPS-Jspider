package com.jspider.day23;

/*
// in each row we have i number of columns
// j starting from 1 and going till val
// i times we are printing start value in column
	j,j,j,j,j
	1,2,3,4,5
i= 1* 
i= 2* * 
i= 3* * * 
i= 4* * * * 
i= 5* * * * * 
*/
public class StarPatternProgram1 {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}
}
