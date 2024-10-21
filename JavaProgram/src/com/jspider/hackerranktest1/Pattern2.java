package com.jspider.hackerranktest1;

/*
1  0  1  0  1  
0  1  0  1  0  
1  0  1  0  1  
0  1  0  1  0  
1  0  1  0  1  
*/
public class Pattern2 {
	public static void main(String[] args) {
		int rows = 5;
		int columns = 5;

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= columns; j++) {
				// Reverse the output by subtracting from 1
				System.out.print(1 - (i + j) % 2 + "  ");
			}
			System.out.println(); // Move to the next line after each row
		}
	}

}
