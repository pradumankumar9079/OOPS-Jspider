package com.jspider.Object;

class Account {
	private long accountNumber = 4567899876L;
	private long aadharNumber = 8765455678l;

	// Override for content comparision
	@Override
	public boolean equals(Object obj) {
		// DownCasting
		Account acc = (Account) obj;
		if (this.accountNumber == acc.accountNumber && this.aadharNumber == acc.aadharNumber) {
			return true;
		} else {
			return false;
		}
	}
}

public class EqualsMethodAccountExample3 {
	public static void main(String[] args) {
		Account acc1 = new Account();
		Account acc2 = new Account();
		System.out.println(acc1.equals(acc2));
	}
}
//true
