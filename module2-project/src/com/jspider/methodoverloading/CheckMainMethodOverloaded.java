package com.jspider.methodoverloading;

//Yes it can be overloaded but can't override static
public class CheckMainMethodOverloaded {
	public static void main(String[] args) {
		System.out.println("main(String[])....");
	}

	public static void main(int args) {
		System.out.println("main(int)....");
	}

	public static void main(char args) {
		System.out.println("main(char)....");
	}

	public static void main(String args) {
		System.out.println("main(String)....");
	}
}
//main(String[])....
