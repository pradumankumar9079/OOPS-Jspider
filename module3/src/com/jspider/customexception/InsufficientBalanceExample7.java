package com.jspider.customexception;

// Unchecked Exception
class InsufficientBalanceException extends RuntimeException {

}

class AtmToWithdraw {
	static int balance = 10000;

	static void checkBalance(int withdrawalAmount) {
		if (withdrawalAmount > 10000) {
			throw new InsufficientBalanceException();
		}
	}
}

public class InsufficientBalanceExample7 {
	public static void main(String[] args) {
		try {
			AtmToWithdraw.checkBalance(2345);// will not Cause Exceptiom
			AtmToWithdraw.checkBalance(56789);// Will Cause Exception
		} catch (InsufficientBalanceException e) {
			e.printStackTrace();
		}
		System.out.println("Raja raj");
	}
}

//com.jspider.customexception.InsufficientBalanceException
//Raja raj
//	at com.jspider.customexception.AtmToWithdraw.checkBalance(InsufficientBalanceExample7.java:13)
//	at com.jspider.customexception.InsufficientBalanceExample7.main(InsufficientBalanceExample7.java:22)
