package com.jspider.day43bitwiseoperator1;

// Eg of BitWises
// Bitwise(&,etc..) Work on Numeric as well as Boolean
// Logical(&&,etc...) Operator work on Boolean Only
// Remaining bit if positive 0
// Remain bit if negative 1

public class BitWiseEg1 {
	public static void main(String[] args) {
		System.out.println(false & true);
		System.out.println(true | false);
		System.out.println(false ^ true);
		System.out.println(true ^ true);
		System.out.println(4 & 5);// 4 convert into bit than try it out
		System.out.println(4 | 5);
		System.out.println(4 ^ 5);
		System.out.println(4 & 7);
		System.out.println(7 ^ 4);
	}
}
//false
//true
//true
//false
//4
//5
//1
//4
//3
