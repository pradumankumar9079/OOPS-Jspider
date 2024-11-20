package com.jspider.practice;

public class Practice1 {
	public static void main(String[] args) {
		int a = 19;
		int sum = 0;
		while (a > 10) {
			while (a > 0) {
				int rem = a % 10;
				sum += rem;
				a /= 10;
			}
			a = sum;
		}
		System.out.println(sum);
	}
}
