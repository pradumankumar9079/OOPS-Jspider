package com.jspider.test;

import com.jspider.encapsulation.FoxTroatModifier1_1;

public class FlowerModifier1_3 extends FoxTroatModifier1_1 {
	public static void main(String[] args) {
		// System.out.println(FoxTroat.a);// this is with in class
		// System.out.println(FoxTroat.b);// this is package private

		/**********************************************/
		System.out.println(FoxTroatModifier1_1.c);
		// this is accessible with in package
		// without inheritance outside package with inheritance need to import
		// remove extends this won't work
		/**********************************************/

		System.out.println(FoxTroatModifier1_1.d); // Accessible AnyWhere need to import ,remove extends this will work
	}
}
