package com.jspider.encapsulation;

// 1.2
// for 1.3 access test package test Flower Class
public class GeronimoModifier1_2 {
	public static void main(String[] args) {
		// System.out.println(FoxTroat.a);// this is with in class
		System.out.println(FoxTroatModifier1_1.b);// this is package private

		/**********************************************/
		System.out.println(FoxTroatModifier1_1.c);
		// this is accessible with in package
		// without inheritance outside package with inheritance and need import
		/**********************************************/

		System.out.println(FoxTroatModifier1_1.d); // Accessible AnyWhere need import
	}
}
