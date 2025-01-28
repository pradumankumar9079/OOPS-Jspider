package dsaday5;

import java.util.LinkedHashMap;

public class FrequencyOfEachChar1 {
	public static void main(String[] args) {
		String str = "This is Raja raj";
		LinkedHashMap<Character, Integer> hm = new LinkedHashMap<>();

		for (int i = 0; i <= str.length() - 1; i++) {
			if (hm.containsKey(str.charAt(i))) {
				hm.put(str.charAt(i), hm.get(str.charAt(i)) + 1);
			} else {
				hm.put(str.charAt(i), 1);
			}
		}
		System.out.println(hm);
	}
}
