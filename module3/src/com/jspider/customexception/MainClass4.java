package com.jspider.customexception;

//UnChecked Custom Exception because Extending With RuntimeException

class LimitExceedException extends RuntimeException {// 1

}

class Atm {// 2
	static int attempt = 0;

//	throws LimitExceedException--> optional Unchecked

	static void checkAttempt() {
		attempt++;
		if (attempt > 5) {

			// This is Extended With RuntimeException so no need to use throws in method
			// Declaration it is a Unchecked Exception Which Automatically Propogate
			throw new LimitExceedException();
		}
	}
}

public class MainClass4 {
	public static void main(String[] args) {
		try {

			// After 5 Attempt it will Throw Exception
			Atm.checkAttempt();
			Atm.checkAttempt();
			Atm.checkAttempt();
			Atm.checkAttempt();
			Atm.checkAttempt();
			Atm.checkAttempt();

		} catch (LimitExceedException e) {
			e.printStackTrace();
		}
		System.out.println("Raja raj");
	}
}
//com.jspider.customexception.LimitExceedException
//at com.jspider.customexception.Atm.checkAttempt(MainClass4.java:20)
//at com.jspider.customexception.MainClass4.main(MainClass4.java:35)
//Raja raj
