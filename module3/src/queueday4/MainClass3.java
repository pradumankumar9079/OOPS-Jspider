package queueday4;

import java.util.LinkedList;

public class MainClass3 {
	public static void main(String[] args) {
		System.out.println("------------------------");
		LinkedList l1 = new LinkedList();
		l1.add(20);
		l1.add(45);
		l1.add(12);
		l1.add(25);
		l1.add(9);
		l1.add(30);

		// Deque Operations(Insertion Deleteion at both End
		System.out.println("List Element: ");
		System.out.println(l1);

		l1.addFirst(100);
		System.out.println("List Element: ");
		System.out.println(l1);

		l1.addLast(200);
		System.out.println("List Element: ");
		System.out.println(l1);

		Object o1 = l1.getFirst();
		System.out.println(o1);// 100

		Object o2 = l1.getLast();
		System.out.println(o2);// 200

		// Remove and return element
		Object o3 = l1.removeFirst();
		System.out.println(o3);
		System.out.println("List Element: ");
		System.out.println(l1);

		// Remove and return element
		Object o4 = l1.removeLast();
		System.out.println(o3);
		System.out.println("List Element: ");
		System.out.println(l1);

		System.out.println("------------------------");
	}
}
