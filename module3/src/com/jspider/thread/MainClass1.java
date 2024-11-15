package com.jspider.thread;//1

// By Extending Thread Class
class DemoThread extends Thread {
	@Override // 2
	public void run() {
		for (int a = 1; a <= 5; a++) {
			System.out.println("demo thread....");
		}
	}
}

public class MainClass1 {
	public static void main(String[] args) {
		System.out.println("Program Starts");
		DemoThread dt = new DemoThread();// 3
		dt.start();// 4

		for (int a = 1; a <= 5; a++) {
			System.out.println("main thread....");
		}
		System.out.println("Program Ends");
	}
}

// We we not get output according to our expectation Always
//Program Starts
//main thread....
//main thread....
//main thread....
//main thread....
//main thread....
//Program Ends
//demo thread....
//demo thread....
//demo thread....
//demo thread....
//demo thread....
