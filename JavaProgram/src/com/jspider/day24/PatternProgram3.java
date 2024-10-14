package com.jspider.day24;

// Number Pyramid
/*
     1    
   123   
  12345  
 1234567 
123456789
*/
public class PatternProgram3 {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			int num = 1;
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(num++);
			}
			for (int k = 1; k <= i - 1; k++) {
				System.out.print(num++);
			}
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
