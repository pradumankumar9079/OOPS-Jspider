package com.jsp.hashmap;

import java.util.HashMap;

public class FindOccurence1 {
	public static void main(String[] args) {
		String str = "This is Raja raj";
		occurenceOfEach(str);
	}

	public static void occurenceOfEach(String str) {
		HashMap<Character, Integer> hm = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			if (hm.containsKey(str.charAt(i))) {
				hm.put(str.charAt(i), hm.get(str.charAt(i)) + 1);
			} else {
				hm.put(str.charAt(i), 1);
			}
		}
		System.out.println(hm);
	}

}
