package com.jspider.day32array6;

// WAP To find Sum of Integer element in Object Array
public class SumOfIntegerIntoObjectArray1 {
	public static void main(String[] args) {

		// Number(we can store float as well as Integer) is also present like Object

		Object o[] = { 1, 2, 'c', "Raja", 1.2, false };

		// Taking one by one element and checking it's Integer or not
		for (int i = 0; i <= o.length - 1; i++) {
			// Use Wrapper Class Don't use int primitive after instanceof
			if (o[i] instanceof Integer) {
				System.out.println(o[i]);
			}
		}
	}
}

//1
//2
