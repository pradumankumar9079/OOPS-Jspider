package test;

import java.util.TreeSet;

class Employe implements Comparable {
	String name;
	double sal;

	Employe(String name, double sal) {
		this.name = name;
		this.sal = sal;
	}

	public int compareTo(Object e) {
		Employe empSal = (Employe) e;
		if (this.sal > empSal.sal) {
			return 1;
		} else if (this.sal < empSal.sal) {
			return -1;
		} else {
			return 0;
		}
	}
}

public class CflSort1 {
	public static void main(String[] args) {
		Employe e1 = new Employe("Raj", 20000.0);
		Employe e2 = new Employe("Riya", 50000.0);
		Employe e3 = new Employe("Anuj", 5000.0);
		Employe e4 = new Employe("Vishal", 6500.0);
		Employe e5 = new Employe("Ankita", 8000.0);

//		PriorityQueue<Employe> pq = new PriorityQueue<Employe>();
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

//		ArrayList<Employe> list = new ArrayList<>();
//		list.add(e1);
//		list.add(e2);
//		list.add(e3);
//		list.add(e4);
//		list.add(e5);
//		Collections.sort(list);
//		System.out.println("Name" + "\t" + "Sal");
//		for (Employe e : list) {
//			System.out.println(e.name + "\t" + e.sal);
//		}

		TreeSet<Employe> ts = new TreeSet<>();
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		ts.add(e5);
		System.out.println("Name" + "\t" + "Sal");
		for (Employe e : ts) {
			System.out.println(e.name + "\t" + e.sal);
		}

	}
}