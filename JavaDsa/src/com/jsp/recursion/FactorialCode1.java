package com.jsp.recursion;

//TC-->O(n)
//SC-->O(n)
public class FactorialCode1 {
	public static void main(String[] args) {
		int n = 5;
		int res = factorial(n);
		System.out.println(res);
	}

	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		}
		int fnm1 = factorial(n - 1);
		int fn = n * fnm1;
		return fn;
	}
}
