package com.jspider.inheritance;

// Rules of Inheritance
class Delta {

	// point a) Private
	private void test() {
		System.out.println("Executing Test().........");
	}
}

class Example extends Delta {
	// point b) Static
	static void disp() {
		System.out.println("Executing Disp().........");
	}
}

/*-----------------------------------------------------------------*/
// Final class is not add anything after declaring it final
//The type Example1 cannot subclass the final class Gamma CTE
//
//final class Gamma {
//
//}
//
//class Example1 extends Gamma{ // we can Declare Final here
//	
//}

// final variable or method can be accessed from child class
/*-----------------------------------------------------------------*/

public class MainClass3 {
	public static void main(String[] args) {
		Example ex = new Example();
		// it's Private can't be Accessed
		// ex.test();

		// Even though we are able to access it's not inheritance(Static Member)
//		ex.disp();

	}
}
