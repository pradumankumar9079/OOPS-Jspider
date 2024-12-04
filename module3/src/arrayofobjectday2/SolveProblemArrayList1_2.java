package arrayofobjectday2;

import java.util.ArrayList;

/**
 * Identifying Integer and Double Finding Total Sum Byte Float
 */

public class SolveProblemArrayList1_2 {
	public static void main(String[] args) {
		System.out.println("--------------");
		ArrayList l1 = new ArrayList();
		l1.add("Mango");
		l1.add(10);
		l1.add(20);
		l1.add("Apple");
		l1.add(4.5);
		l1.add("Grapes");
		l1.add(1.2);
		l1.add("orange");
		l1.add(2.1);

		double sum = 0.0;
		String res = "";
		for (int i = 0; i < l1.size(); i++) {

			/***************** first Way ***********/
			// To Identify Integer
//			if (l1.get(i) instanceof Integer) {
////				System.out.println(l1.get(i));
//				// DownCating because i wanna use toUpperCase or toLowerCase it's object type
//				// right now after downcasting it's String type
//				sum = sum + (Integer) l1.get(i);
//			}
//
//			// To Identify Double
//			else if (l1.get(i) instanceof Double) {
//				sum = sum + (Double) l1.get(i);
//
//			}
			/****************************************/

			/************** Second Way **************/
			/**
			 * Code Reduced Here Number Class is abstract class it consist of six inbuilt
			 * abstract method(implementation in respective wrapper class) which use to
			 * convert further number to doubleValue() or intValue()...etc
			 * 
			 */
			if (l1.get(i) instanceof Number) {
				sum = sum + ((Number) l1.get(i)).doubleValue();
			}

			else if (l1.get(i) instanceof String) {
//				String str = (String) l1.get(i);
				// We Can Concatinate Without DownCasting as Well
				res = res + l1.get(i);
			}
			/****************************************/
		}
		System.out.println("Total Sum is: " + sum);
		System.out.println("String is: " + res);
		System.out.println("--------------");
	}
}
