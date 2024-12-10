package arrayofobjectday3;

import java.util.ArrayList;

import java.util.List;

public class Arraylist3 {
	public static void main(String[] args) {
		/**
		 * Till Now We Learnt This Much Method add(element) size() isEmpty() get(index)
		 * remove(index) remove(element) clear() add(index,element)
		 * contains(element),set(index,element)
		 */

		System.out.println("------------");
		/**
		 * Create an empty ArrayList containing an array of Object Type
		 */
		ArrayList l1 = new ArrayList();

		/**
		 * Create an empty ArrayList Containg an Array Of String Type
		 */

		/**
		 * ArrayList Of Generics Type--> inside diamond Operator we are always writing
		 * className <String> --> This is Diamond Operator
		 */
		ArrayList<String> l2 = new ArrayList<String>();
		l2.add("Raja");
		l2.add("Raj");
		l2.add("Riya");
		// Won't work it's String Type Only
		// l2.add(2345);

		System.out.println("Elements are: ");
		for (String str : l2) {
			/**
			 * here we don't need to perform explicit downcasting because we are storing
			 * into string type so we can perform string method directly now
			 * 
			 */
			System.out.print(str.toUpperCase() + " ");
		}

		/**************** Missed **********************/
		/**
		 * To Check Something is Present inside our ArrayList Or Not --> it will return
		 * true or false
		 */
		boolean res = l2.contains("Riya");
		System.out.println(res);

		/**
		 * To Replace with Particular Elements
		 */
		l2.set(1, "Riya raj");
		System.out.println(l2);

		/***********************************************/

		System.out.println("---Mine---");
		/**
		 * inside diamond Operator we are always writing className <SavingsAccount> -->
		 * This is Diamond Operator
		 */
		ArrayList<SavingsAccount> l3 = new ArrayList<SavingsAccount>();
		SavingsAccount svg = new SavingsAccount(2);
		l3.add(svg);
		l3.add(svg);
		l3.add(svg);
		// Won't work it's String Type Only
//	l2.add(2345);

		System.out.println("Elements are: ");
		for (SavingsAccount savingsAccount : l3) {
			System.out.print(savingsAccount.id + " ");
		}

		System.out.println("---Mine----");
	}
}
