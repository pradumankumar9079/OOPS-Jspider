package com.jspider.day27array1;

//WAP To Print all Prime Present in The Array
public class PrintAllPrime3 {
	public static void main(String[] args) {
		int x[] = new int[4];
		x[0] = 3;
		x[1] = 4;
		x[2] = 10;
		x[3] = 7;

		System.out.println("Prime Elements are: ");
		for (int i = 0; i < x.length; i++) {
			if (isPrime(x[i]) == true) {
				System.out.println(x[i]);
			}
		}
	}

	static boolean isPrime(int num) {
		// for one and less than one like negative
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}
}
//Prime Elements are: 
//3
//7
