package hashtable7;

import java.util.HashMap;

public class MainClass2 {
	public static void main(String[] args) {
		HashMap map1 = new HashMap();
		System.out.println("Is Map Empty? " + map1.isEmpty());
		System.out.println("Map Size " + map1.size());

		// Make a Entry where Test is Mapped(associated) to 12
		// Stor Data in Map
		map1.put(12, "Test");
		map1.put(3.5, true);
		map1.put("pqr", 12345);
		map1.put('t', 5.6);

		System.out.println("Map Elements: ");
		System.out.println(map1);

		// i wanna perform String related method so DownCast Because internally it is
		// Upcasted to Object
		Object value = map1.get(12);
		System.out.println(value);

		// it will remove key value pair
		map1.remove(12);
		System.out.println("Map Elements: ");
		System.out.println(map1);
	}
}
