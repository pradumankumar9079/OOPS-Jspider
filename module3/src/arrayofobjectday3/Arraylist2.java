package arrayofobjectday3;

import java.util.ArrayList;

public class Arraylist2 {
	public static void main(String[] args) {
		ArrayList l1 = new ArrayList();// collection of any type of object(element) (raw type)
		l1.add(2);
		l1.add("Mango");
		l1.add(10);
		l1.add(4.5);
		l1.add("Apple");

		System.out.println("Total Elements: " + l1.size());
		System.out.println("Elements are: ");
		System.out.println(l1);

		/**
		 * Converting ArrayList Object to Normal Array in this case we can't use
		 * properties associated to ArrayList(like add,remove) but we can use properties
		 * Associated to Array(Like length)
		 */
		Object[] objArr = l1.toArray(); // ArrayList elements are represented as Array Of Object type

		// Either use this or use enhance for loop to iterate collections
//		for (int i = 0; i < objArr.length; i++) {
//			System.out.println(objArr[i]);
//		}

		System.out.println("enhanched for loop");
		/**
		 * it's basically introduced for collection
		 */
		for (Object obj : l1) {
			/**
			 * firstly first element will get assigned to obj than second than so on....
			 * after getting element we can perform any kind of operation by using
			 * downcasing
			 */
			System.out.println(obj);
		}
	}
}
