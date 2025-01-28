package dsaday6;

import java.util.HashMap;
import java.util.Set;

public class SumOfDuplicate1 {
	public static void main(String[] args) {
		int arr[] = { 12, 7, 9, 8, 8, 8, 12, 66, 1, 3, 1 };
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int i = 0; i <= arr.length - 1; i++) {
			if (hm.containsKey(arr[i])) {
				hm.put(arr[i], hm.get(arr[i]) + 1);
			} else {
				hm.put(arr[i], 1);
			}
		}

		int sum = 0;
		Set<Integer> keys = hm.keySet();
		for (Integer key : keys) {
			if (hm.get(key) > 1) {
				sum += key;
			}
		}
		System.out.println("Sum is " + sum);
	}
}
