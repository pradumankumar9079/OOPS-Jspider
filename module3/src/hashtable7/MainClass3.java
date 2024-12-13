package hashtable7;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MainClass3 {
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
		map1.put(false, 45);

		System.out.println("Map Elements: ");
		System.out.println(map1);

		boolean res1 = map1.containsKey("pqr");
		System.out.println(res1);

		boolean res2 = map1.containsValue(5.6);
		System.out.println(res2);

		// go to map it make a set of key
		Set keys = map1.keySet();
		System.out.println(keys);

		// but we lost association
		Collection values = map1.values();
		System.out.println(values);

		// Printing Each Key Value Pair if i dont know key use keyset and find value
		// accordingly
		for (Object key : keys) {
			Object value = map1.get(key);
			System.out.println(key + "-->" + value);
		}
	}
}
