package setday5;

import java.util.LinkedHashSet;

public class MainClass1 {
	public static void main(String[] args) {
		System.out.println("-----------");
		// Create Empty Set
		// LinkedHashSet-->maintain Order Of Insertion and no Duplicate
		LinkedHashSet set1 = new LinkedHashSet();
		System.out.println("Is Set Empty? " + set1.isEmpty());
		System.out.println("Set Size: " + set1.size());

		// set add the element if not duplicate(and random Order)
		set1.add(25);
		set1.add("test");
		set1.add(5.6);
		set1.add('t');
		set1.add(true);
		set1.add(null);// allowed

		System.out.println("Is Set Empty? " + set1.isEmpty());
		System.out.println("Set Size: " + set1.size());
		System.out.println("Set Elements: ");
		System.out.println(set1);

		System.out.println("adding duplicate elements: ");
		set1.add("test");// does not allowed already present in set
		System.out.println("Is Set Empty? " + set1.isEmpty());
		System.out.println("Set Size: " + set1.size());
		System.out.println("Set Elements: ");
		System.out.println(set1);

		// in List using Index
		// in queue remove one by one to access
		// we can't access single element we have go through each element(using enhance
		// for loop)
		for (Object element : set1) {
			System.out.println(element);
		}

		System.out.println("-----------");
	}
}
