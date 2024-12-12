package setday5;

import java.util.TreeSet;

public class MainClass2 {
	public static void main(String[] args) {
		System.out.println("----");
		TreeSet set1 = new TreeSet();
		System.out.println("Is Set Empty? " + set1.isEmpty());
		System.out.println("Set Size: " + set1.size());

		// TreeSet WhatEver Type of Data We Are Inserting at starting we need to keep
		// adding that kind of Data Only Else ClassCastException
		// When we add Element it Sort it(in ascending Order) and insert
		set1.add(50);
		set1.add(25);
		set1.add(30);
		set1.add(15);
		set1.add(20);
//		set1.add(null);// not allowed here

		// TreeSet WhatEver Type of Data We Are Inserting at starting we need to keep
		// adding that kind of Data Only Else ClassCastException
		System.out.println("Is Set Empty? " + set1.isEmpty());
		System.out.println("Set Size: " + set1.size());
		System.out.println(set1);
		System.out.println("----");
	}
}
