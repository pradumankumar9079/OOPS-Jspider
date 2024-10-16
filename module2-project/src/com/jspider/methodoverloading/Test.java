
package com.jspider.methodoverloading;

class bike {

	void engine(double cc) {
		System.out.println("double");

	}

	void engine(int cc) {
		System.out.println("int");

	}

	void engine(int mil, double cc) {
		System.out.println("60");
	}

	void engine(double cc, int mil) {
		System.out.println("60");
	}

	void engine(String bike) {
		System.out.println("yamaha");
	}
}

public class Test {
	public static void main(int b, String[] args) // length argument
	{

	}

	public static void main(String[] args) // type argument
	{
		bike b = new bike();
		b.engine(500.0);
		b.engine(10);
//		b.engine(600.0, 60);
//		b.engine(600, 60.0);
////		b.engine("ji7h");

	}

	public static void main(String[] hy, int args) {

	}

}
