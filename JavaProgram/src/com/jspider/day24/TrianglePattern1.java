package com.jspider.day24;

/*
    *
   **
  ***
 ****
*****
*/

// Inner k loop
/*for (int k = 1; k <= i; k++) {
	// Important
	// if we give one more space here than we will get Triangle
	System.out.print("* ");
}
System.out.println();
*/
/*
 * Triangle  for pyramid
    * --1		--1
   * *  --2 	--3
  * * * --3	    --5
 * * * * --4 	--7
* * * * * --5	--9
*/
public class TrianglePattern1 {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			// Loop to print space Value
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			// Loop to print star Value
			for (int k = 1; k <= i; k++) {
				// Important --> Interview Question
				// if we give one more space here than we will get Triangle
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
