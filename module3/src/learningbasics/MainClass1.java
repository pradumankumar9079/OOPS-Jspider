package learningbasics;

import java.util.ArrayList;

public class MainClass1 {
	public static void main(String[] args) {
		System.out.println("Main method started");

		ArrayList l1 = new ArrayList();// this object internally has an array of Object type
		// will have capacity 10.ArrayList object is empty(Means nothing is stored)

		// checking in Collection is Empty or not
		boolean res1 = l1.isEmpty();
		System.out.println(res1);// true

		// to check number of elements
		int n = l1.size();
		System.out.println(n);// 0 size is zero capacity is 10

		/**
		 * Collection of heterogeneous data(Removing Disadvantage of Array)
		 ****/
		// to storing a data
		l1.add(100);
		// AutoBoxing 100 converted to Integer Wrapper Class Than It will get Converted
		// into Object Type
		l1.add(1.5);
		l1.add("Ramesh");// No AutoBoxing for this because it's a class
		l1.add(150);
		l1.add("Suresh");
		l1.add(true);
		l1.add(null);
		l1.add(100);
		l1.add("Jaggu");
		l1.add('t');
		l1.add("Mukesh");
		// in collection capacity is not there so we can add as much element we
		// want(that's a limitation in Array)

		System.out.println("---------------");

		// checking in Collection is Empty or not
		res1 = l1.isEmpty();
		System.out.println(res1);// true

		// to check number of elements
		n = l1.size();
		System.out.println(n);// 0 size is zero capacity is 10
		System.out.println("Main method Ended");
	}
}
