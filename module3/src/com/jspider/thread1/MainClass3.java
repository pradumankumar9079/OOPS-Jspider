package com.jspider.thread1;

class MyThread implements Runnable {

	@Override
	public void run() {
		for (int a = 1; a <= 5; a++) {
			Thread th = Thread.currentThread();
			System.out.println("ID: " + th.getId() + "Name: " + th.getName() + "Priority: " + th.getPriority());
		}
	}

}

public class MainClass3 {
	public static void main(String[] args) {
		System.out.println("Progam Starts");
		Thread t1 = new Thread(new MyThread());
		// id setMethod is Not There
		t1.setName("ironman");
		t1.setPriority(2);
		t1.start();

		Thread t2 = new Thread(new MyThread());
		t2.setName("thor");
		t2.start();

		System.out.println("Program Ends");
	}
}
//  Actually priority worked here internally but we are having more resource so worked simultaneously
// car example one lane six lane

//Progam Starts
//Program Ends
//ID: 18Name: ironmanPriority: 2
//ID: 18Name: ironmanPriority: 2
//ID: 18Name: ironmanPriority: 2
//ID: 18Name: ironmanPriority: 2
//ID: 18Name: ironmanPriority: 2
//ID: 19Name: thorPriority: 5
//ID: 19Name: thorPriority: 5
//ID: 19Name: thorPriority: 5
//ID: 19Name: thorPriority: 5
//ID: 19Name: thorPriority: 5
