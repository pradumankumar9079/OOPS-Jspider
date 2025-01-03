package com.jsp.demoApp;

public class DemoApplication {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Connected");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
