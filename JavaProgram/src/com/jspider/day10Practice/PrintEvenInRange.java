package com.jspider.day10Practice;

//2 4 6 8 10 12 14 16 18 20 
public class PrintEvenInRange {
	public static void main(String[] args) {
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0)
				System.out.print(i + " ");
		}
	}
}
