package cfl;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

//class Employe implements Comparable {
//	String name;
//	double sal;
//
//	Employe(String name, double sal) {
//		this.name = name;
//		this.sal = sal;
//	}
//
//	public int compareTo(Object e) {
//		Employe empSal = (Employe) e;
//		if (this.sal > empSal.sal) {
//			return 1;
//		} else if (this.sal < empSal.sal) {
//			return -1;
//		} else {
//			return 0;
//		}
//	}
//}

//SalaryComparator
class Employe {
	String name;
	double sal;

	Employe(String name, double sal) {
		this.name = name;
		this.sal = sal;
	}

	public String toString() {
		return name + " " + sal;
	}
}

public class CflSort1 {
	public static void main(String[] args) {
		Employe e1 = new Employe("Raj", 20000.0);
		Employe e2 = new Employe("Riya", 50000.0);
		Employe e3 = new Employe("Anuj", 5000.0);
		Employe e4 = new Employe("Vishal", 6500.0);
		Employe e5 = new Employe("Ankita", 8000.0);
		SalaryComparator sc = new SalaryComparator();

//		PriorityQueue<Employe> pq = new PriorityQueue<Employe>();
//		PriorityQueue<Employe> pq = new PriorityQueue<Employe>(sc);
//
//		pq.add(e1);
//		pq.add(e2);
//		pq.add(e3);
//		pq.add(e4);
//		pq.add(e5);
//
//		System.out.println("Name" + "\t" + "Sal");
//		int cnt = 0;
//		while (pq.isEmpty() == false) {
//			if (cnt == 1) {
//				System.out.println(pq.peek().name + "\t" + pq.peek().sal);
//				break;
//			}
//			cnt++;
//			pq.poll();
//		}

		ArrayList<Employe> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		Collections.sort(list, sc);// in Priority Queue and TreeSet we have comparable constructor not have
									// Collections.sort() other is having Collections.sort(class,comparator)

		System.out.println("Name" + "\t" + "Sal");
		Iterator<Employe> itr = list.iterator();
		int cnt = 0;
		while (itr.hasNext()) {
			if (cnt == 1) {
				/************************************/
//				The type mismatch is happening because remove() doesn’t return anything that can directly be converted to Object. You need to capture the element before calling remove() with next(), and then remove it.

//				Employe removedElement = itr.next();  // Capture the element to remove
//                itr.remove();  // Removes the element
//                System.out.print("Removed: " + removedElement);  // Print the removed element
				/************************************/

				// or print later using foreac to see what it removes
				itr.remove();
			}
			cnt++;
			System.out.println(itr.next());
		}
		System.out.println("---------------");
		for (Employe e : list) {
			System.out.println(e.name + "\t" + e.sal);
		}

//		TreeSet<Employe> ts = new TreeSet<>();

//		SalaryComparator sc = new SalaryComparator();
//		TreeSet<Employe> ts = new TreeSet<>(sc);
//		ts.add(e1);
//		ts.add(e2);
//		ts.add(e3);
//		ts.add(e4);
//		ts.add(e5);
//		System.out.println("Name" + "\t" + "Sal");
//		for (Employe e : ts) {
//			System.out.println(e.name + "\t" + e.sal);
//		}
//
	}
}