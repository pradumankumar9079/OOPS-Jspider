package com.jspider.thread;

// By Implementing Runnable Interface
class SampleThread implements Runnable {// 1

	@Override
	public void run() {// 2
		for (int a = 1; a <= 5; a++) {
			System.out.println("sample thread");
		}
	}
}

public class MainClass2 {
	public static void main(String[] args) {
		System.out.println("Program starts");
		SampleThread st = new SampleThread();// 3
		Thread th = new Thread(st);// 4
		th.start();// 5

		for (int a = 1; a <= 5; a++) {
			System.out.println("main thread");
		}
		System.out.println("Program Ends");
	}
}
//We we not get output according to our expectation Always
//Program starts
//main thread
//main thread
//main thread
//main thread
//main thread
//Program Ends
//sample thread
//sample thread
//sample thread
//sample thread
//sample thread
