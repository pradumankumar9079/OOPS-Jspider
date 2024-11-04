package com.jspider.day33string1;

import java.util.Scanner;

// WAP to reverse the string
// concat only take string as parameter
// next() method take input till space or else for whole statement use nextLine()
// refer note for length and length() difference 
// for now don't use method(but i Used it)
public class RevereseString1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String Value: ");
		String s1 = sc.nextLine();

		// Unlike Array We Need To Store
		String res = reverse(s1);
		System.out.println("Reversed Sting is: ");
		System.out.println(res);

		/*************************************************/
		// we can use string builder because we are having reverse() method
		System.out.println(new StringBuilder(s1).reverse());

		// again converting sb object into string(just for knowledge)
		String s2 = new StringBuilder(s1).reverse().toString();
		System.out.println(s2);
		/************************************************/

	}

	private static String reverse(String s1) {
		String rev = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			char ch = s1.charAt(i);
			rev = rev + ch;
		}
		return rev;
	}

}
//Enter the String Value: 
//raja
//Reversed Sting is: 
//ajar
