package com.jspider.exceptionhandling;

// throws Example 2 throwing multiple exception
// this is checked exception we need to write throws statement
// in unchecked it's optional write or not automatically propogates                                                                                  
class HelloBro {
	void greeting() {
		System.out.println("Hello EveryOne");
	}

//	private HelloBro() {
//
//	}
}

public class MainClass7 {

	static void instantiate() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
		HelloBro h = (HelloBro) Class.forName("com.jspider.exceptionhandling.HelloBro").newInstance();
		h.greeting();
	}

	public static void main(String[] args) {
		try {
			instantiate();
		} catch (ClassNotFoundException e) {
			System.out.println("No Such Class Found");
		} catch (IllegalAccessException e) {
			System.out.println("Access Denied");
		} catch (InstantiationException e) {
			System.out.println("Object Creation Failed");
		}
	}
}

// Based on Mistake We Will get Output or Exception
