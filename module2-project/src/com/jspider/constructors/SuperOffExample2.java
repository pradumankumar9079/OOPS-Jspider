package com.jspider.constructors;

class Alpha {
	Alpha() {
		System.out.println("Alpha() Constructor");
	}

	Alpha(int a) {
		System.out.println("Alpha(int) Constructor");
	}
}

class Beta extends Alpha {
	Beta() {
		super();// if not written than it will call
//		zero argument or default constructor it can't call both
		System.out.println("Beta() Constructor");
	}

	Beta(int a) {
		System.out.println("Beta(int) Constructor");
	}

}

public class SuperOffExample2 {
	public static void main(String[] args) {
		Beta ref = new Beta();
	}
}
