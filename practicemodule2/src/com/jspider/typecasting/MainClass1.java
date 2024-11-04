package com.jspider.typecasting;

public class MainClass1 {
	public static void main(String[] args) {
		// byte,short,char,int,long,float,double (65,536)--> Unicode
		int a = 48;
		char ch = (char) a;// Narrowing(Explicit)
		float f = a;// Widening(Implicit)

		System.out.println(f);
		System.out.println(ch);

	}
}
