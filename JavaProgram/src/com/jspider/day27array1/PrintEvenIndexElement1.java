package com.jspider.day27array1;

// Look at Note for Array Points
// WAP To Print Even Index Elements
public class PrintEvenIndexElement1 {
	public static void main(String[] args) {
		int x[] = new int[4];
		x[0] = 10;
		x[1] = 20;
		x[2] = 30;
		x[3] = 40;

		for (int i = 0; i < x.length - 1; i++) {
			if (i % 2 == 0) {
				System.out.print(x[i] + " ");
			}
		}
	}
}

//10 30
