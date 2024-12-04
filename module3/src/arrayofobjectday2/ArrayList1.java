package arrayofobjectday2;

import java.util.ArrayList;

/**
 * Method's in ArrayList --> add()--to add, size()--size only not
 * capacity,get()--to access particular element
 */

public class ArrayList1 {
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		ArrayList l1 = new ArrayList();
		// Adding each element one by one(This is Append)
		l1.add(120);
		l1.add(5.6);
		l1.add("Apple");
		l1.add('t');
		l1.add(true);

		// determining size of arraylist
		int n = l1.size();
		System.out.println("Total Element: " + n);// print total number of element present in arraylist
		System.out.println("ArrayList Elements: ");
		System.out.println(l1);// print arraylist

		// Storing into Object type because it's upcasted to objcet
//		Object o = l1.get(2);// accessing the element @ index 2

		// Performing DownCasting to access particular element because it's Object type
		String str = (String) l1.get(2);// we need to downcast because it array of object type
		System.out.println(str);

		Double d = (Double) l1.get(1);
		System.out.println(d);

		// We are not allowed to access this as we can only access size not capacity
//		l1.get(6);// java.lang.IndexOutOfBoundsException

		// Access Element from ArrayList
		for (int i = 0; i < l1.size(); i++) {
			System.out.print(l1.get(i) + ", ");
		}

		// Add at Specific Position(Not Replace shift)
		l1.add(5, "newElement"); // insert at 6 will not happend Because we are having only 5 element
		// in other words insertion is allowed where we have element
		// it performing right shift operation internally
		System.out.println("Elements are: ");
		System.out.println(l1);
		System.out.println(l1.size());

		// Removed from specific index
		// this perform left shift internally
//		l1.remove("newElement");
		/****************************************************/
		// here it will considered as index (Because it's primitive)
//		l1.remove(2);// remove element at index 2

		// l1.remove(new Ineger(2))// now it will remove element 2
		// because there it's object in ArrayList and now i am Passing 2 as a Object in
		// case of String it's considered as Object so it will remove that particular
		// value

		// l1.remove(10);// we will get-->java.lang.IndexOutOfBoundsException
		/****************************************************/
		System.out.println("Elements are: ");
		System.out.println(l1);
		System.out.println(l1.size());

		// Removing All Element From ArrayList
//		l1.clear();
		System.out.println("Elements are: ");
		System.out.println(l1);
		System.out.println(l1.size());

		System.out.println("Main Method Ends");
	}
}
