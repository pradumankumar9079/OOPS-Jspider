package com.jspider.day27array1;

//WAP To Print all Prime Present in The Array
public class PrintAllPrime3 {
	public static void main(String[] args) {
		int x[] = new int[4];
		x[0] = 5;
		x[1] = 8;
		x[2] = 9;
		x[3] = 16;

		for (int i = 0; i < x.length - 1; i++) {
			if (isPrime(x[i])) {
				System.out.println(x[i]);
			}
		}
	}

	static boolean isPrime(int num) {
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}
}
//5
