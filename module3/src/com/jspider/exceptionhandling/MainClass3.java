package com.jspider.exceptionhandling;

class Hello {
	void greeting() {
		System.out.println("Hello Everyone");
	}

	/*************************************/
	// it will give Access Denied
//	private Hello() {
//
//	}
	/************************************/

}

public class MainClass3 {
	public static void main(String[] args) {
		// Hover on new Object Creation it will show u what kind of exception may be
		// occur handle all in catch block
		// these are checked exception

		try {
			Hello h = (Hello) Class.forName("com.jspider.exceptionhandling.Hello").newInstance();
			h.greeting();
		} catch (ClassNotFoundException e) {
			System.out.println("No Such Class Exits");
		} catch (IllegalAccessException e) {
			System.out.println("Access Denied");
		} catch (InstantiationException e) {
			System.out.println("Instantiation Failed");
		}
	}
}
