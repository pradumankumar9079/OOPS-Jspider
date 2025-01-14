package practice;

import java.util.ArrayList;
import java.util.TreeSet;

class Employee implements Comparable {
	int id;
	String name;
	double percent;
	int sal;

	Employee(int id, String name, double percent, int sal) {
		this.id = id;
		this.name = name;
		this.percent = percent;
		this.sal = sal;
	}

	@Override
	public int compareTo(Object sal) {
		Employee e = (Employee) sal;
		if (this.sal < e.sal) {
			return 1;
		} else if (this.sal > e.sal) {
			return -1;
		} else {
			return 0;
		}

	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", percent=" + percent + ", sal=" + sal + "]";
	}

}

class MainClass1 {
	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>();
		Employee e1 = new Employee(101, "Kiyara", 65, 2000);
		Employee e2 = new Employee(102, "Niya", 85, 909);
		Employee e3 = new Employee(103, "Raja raj", 95, 2345);

		list.add(e2);
		list.add(e1);
		list.add(e3);
		TreeSet<Employee> ts = new TreeSet<Employee>(list);
//		for (int i = 0; i < list.size(); i++) {
//			Employee emp = list.get(i);
//			if ((emp.name.charAt(0) == 'K' || emp.name.charAt(0) == 'N') && emp.percent >= 75) {
////				System.out.println(emp.id + "\t" + emp.name + "\t" + emp.percent);
//				System.out.println(emp.toString());
//			}
//		}
		System.out.println(list);
		System.out.println("---------");
		System.out.println(ts);
		int cnt = 0;
//		for (Employee e : ts) {
//			cnt++;
//			if (cnt == 2) {
//				System.out.println(e);
//			}
//		}
	}
}
