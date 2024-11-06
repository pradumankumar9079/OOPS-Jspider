package com.jspider.Object;

// Try With Two Class
class Square implements Cloneable {// Making Cloneable
	int side;

	public static void main(String[] args) throws CloneNotSupportedException {// Taking Risk From Compiler
		Square original = new Square();
		original.side = 105;
		Square copy = (Square) original.clone();// Performing Downcasting because internally it's UpCasted to Object
												// Class if we wanna Access data we need to Perfrom DownCasting
		System.out.println(copy.side);
	}
}
//105
