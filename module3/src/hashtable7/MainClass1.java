package hashtable7;

import java.util.Hashtable;

// HashTable(google search any search is build on HashTable)-->Map is also build on HashTable-->follow note
public interface MainClass1 {
	public static void main(String[] args) {
		// Storing Key Value Pair:
		// Key Always Unique(Important)
		// Value Can Be Duplicate
		// Value is mapped to key
		// Value is fetched based on key
		// for eg: instagram login providing key as(id, password);
		// Storing a pair of key value is known as entry(like in ledger)

		// Map is not having any relation with Collection Interface or Iterable
		// Class Diagram is look like set Class Diagram other than HashTable

		System.out.println("----------");
//		HashMap map1 = new HashMap();

//		LinkedHashMap map1 = new LinkedHashMap();// give output in order of insertion
//		{12=Raja, 3.5=true, pqr=12345, t=5.6, 50=null, null=50}

		// it does not support null as value or key
		Hashtable map1 = new Hashtable();

		System.out.println("Is Map Empty? " + map1.isEmpty());
		System.out.println("Map Size " + map1.size());

		// Make a Entry where Test is Mapped(associated) to 12
		// Stor Data in Map
		map1.put(12, "Test");
		map1.put(3.5, true);
		map1.put("pqr", 12345);
		map1.put('t', 5.6);
//		map1.put(50, null);
//		map1.put(null, 50);// allowed but is accessible
//		System.out.println(map1.get(null));

		System.out.println("Is Map Empty? " + map1.isEmpty());
		System.out.println("Map Size " + map1.size());

		// toString Overridden it will give output in flower bracket
//		{12=Test}
		// Unordered
		System.out.println("Adding Duplicate");
		map1.put(12, "Raja");// it will replace that particular value with raja at key
		System.out.println("Is Map Empty? " + map1.isEmpty());
		System.out.println("Map Size " + map1.size());
		System.out.println(map1);
		System.out.println(map1.get(12));
		System.out.println("----------");

	}
}
