package arrayofobjectday2;

import java.util.ArrayList;

/**
 * Identifying String Than Converting into UpperCase(Using String Method)
 */

public class SolveProblemArrayList1_1 {
	public static void main(String[] args) {
		System.out.println("--------------");
		ArrayList l1 = new ArrayList();
		l1.add("Mango");
		l1.add(546);
		l1.add(4.5);
		l1.add("Apple");
		l1.add(56);
		l1.add("Grapes");
		l1.add(8.9);
		l1.add("orange");
		l1.add(6.8);

		for (int i = 0; i < l1.size(); i++) {
			if (l1.get(i) instanceof String) {
//				System.out.println(l1.get(i));
				// DownCating because i wanna use toUpperCase or toLowerCase it's object type
				// right now after downcasting it's String type
				String str = (String) l1.get(i);
				System.out.println(str.toUpperCase());
			}
		}
		System.out.println("--------------");
	}
}
