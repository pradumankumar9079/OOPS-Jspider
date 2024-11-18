package com.jspider.thread2;

//Threa.sleep() Eg1
public class MainClass1 {
	public static void main(String[] args) {
		System.out.println("Program Starts");
		try {
			Thread.sleep(3000);
//			wait()--> We Can't Use it's Internally Used By JVM
		} catch (InterruptedException e) {
			e.printStackTrace();
		} // it will wait for 3s than next line will execute
		System.out.println("Program Ends");
	}
}
//Program Starts
//Program Ends
