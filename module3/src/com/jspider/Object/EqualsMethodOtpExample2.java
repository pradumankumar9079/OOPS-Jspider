package com.jspider.Object;

class OneTimePassword {
	private int otp = 4545;

	@Override
	public boolean equals(Object obj) {
		OneTimePassword otp = new OneTimePassword();
		if (this.otp == otp.otp) {
			return true;
		} else {
			return false;
		}
	}
}

public class EqualsMethodOtpExample2 {
	public static void main(String[] args) {
		OneTimePassword otp1 = new OneTimePassword();
		OneTimePassword otp2 = new OneTimePassword();
		System.out.println(otp1.equals(otp2));
	}
}
//true
