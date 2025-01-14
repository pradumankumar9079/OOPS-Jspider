package cfl;

import java.util.Comparator;

public class SalaryComparator implements Comparator {
	public int compare(Object arg0, Object arg1) {
		Employe e1 = (Employe) arg0;
		Employe e2 = (Employe) arg1;
		if (e1.sal < e2.sal) {
			return 1;
		} else if (e1.sal > e2.sal) {
			return -1;
		} else {
			return 0;
		}
	}
}
