package com.jspider.pojoorbeaanclass;

class Account {
	private long accountNumber;
	private double accountBalance;

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

}

public class AccountMainClass3 {
	public static void main(String[] args) {
		Account a1 = new Account();
		a1.setAccountBalance(25000);
		System.out.println("Account Balance is: " + a1.getAccountBalance());

		a1.setAccountNumber(345678324567899l);
		System.out.println("Account Number is: " + a1.getAccountNumber());
	}
}
