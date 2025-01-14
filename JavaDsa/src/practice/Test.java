package practice;

import java.util.HashMap;

public class Test {
	public static void main(String[] args) {
		String str = "Raja raj";
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (int i = 0; i <= str.length() - 1; i++) {
			if (str.charAt(i) == ' ')
				continue;
			if (hm.containsKey(str.charAt(i))) {
				hm.put(str.charAt(i), hm.get(str.charAt(i)) + 1);
			} else {
				hm.put(str.charAt(i), 1);
			}
		}
		System.out.println(hm);
	}
}
