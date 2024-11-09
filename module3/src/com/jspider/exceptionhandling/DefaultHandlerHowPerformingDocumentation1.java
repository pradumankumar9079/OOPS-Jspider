package com.jspider.exceptionhandling;

public class DefaultHandlerHowPerformingDocumentation1 {
	static void test() {
		System.out.println("test starts");
		System.out.println(10 / 0);
		System.out.println("test ends");
	}

	static void disp() {
		System.out.println("disp starts");
		test();
		System.out.println("disp ends");
	}

	public static void main(String[] args) {
		System.out.println("main starts");
		disp();
		System.out.println("main ends");
	}
}
// Look at it-->

//main starts
//disp starts
//test starts
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at com.jspider.exceptionhandling.DefaultHandlerHowPerformingDocumentation1.test(DefaultHandlerHowPerformingDocumentation1.java:6)
//	at com.jspider.exceptionhandling.DefaultHandlerHowPerformingDocumentation1.disp(DefaultHandlerHowPerformingDocumentation1.java:12)
//	at com.jspider.exceptionhandling.DefaultHandlerHowPerformingDocumentation1.main(DefaultHandlerHowPerformingDocumentation1.java:18)
