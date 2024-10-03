package com.jspider.day12;

// between 1 to 20
public class printAllOddInRange {
	public static void main(String[] args) {
		for (int i = 1; i <= 20; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
	}
}
