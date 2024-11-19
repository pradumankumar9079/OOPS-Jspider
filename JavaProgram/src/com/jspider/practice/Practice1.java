package com.jspider.practice;

public class Practice1 {
	public static void main(String[] args) {
		String str = "raja";
		for (int i = 0; i <= str.length() - 1; i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				String sub = str.substring(i, j);
				System.out.println(sub);
			}
		}
	}
}
