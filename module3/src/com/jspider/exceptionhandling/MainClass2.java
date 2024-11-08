package com.jspider.exceptionhandling;

// One Try Multiple Catch
// Different Exception Occur for Different Different Input
public class MainClass2 {
	public static void main(String[] args) {
		String str = null;
//		Program Start
//		Access With Null Reference
//		Program End

//		String str = "JSP";
//		Program Start
//		Invalid Index Access
//		Program End

//		String str = "Jspiders";
//		Program Start
//		e
//		Program End

		System.out.println("Program Start");
		try {
			System.out.println(str.charAt(5));
		} catch (NullPointerException e) {
			System.out.println("Access With Null Reference");
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Invalid Index Access");
		}

		System.out.println("Program End");
	}
}
