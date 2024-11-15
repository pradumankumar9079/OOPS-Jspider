package com.jspider.day40array2d1;

// WAP To Print Row Wise and Column Wise
// Observe like this
/*//Column
{ { 10, 20, 30 },// Row 
  { 40, 50, 60 }, 
  { 70, 80, 90 } };
 */
public class WAPToPrint2DRowAndColumnWise2 {
	public static void main(String[] args) {
		int arr[][] = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = 0; j <= arr[i].length - 1; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
//10 20 30 
//40 50 60 
//70 80 90 
