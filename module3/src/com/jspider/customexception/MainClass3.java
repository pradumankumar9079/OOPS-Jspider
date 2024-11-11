package com.jspider.customexception;

//Checked Custom Exception because Extending With Exception 

class InvalidMobileNumberException extends Exception {// 1
	// unnecessary but if we want getMessage to Work we need to Override
	// @Override
//	public String getMessage() {
//		return "InvalidMobileNumberException";
//	}
}

class MobileNumberVerifier {// 2
	static void verifyMobileNumber(String number) throws InvalidMobileNumberException {
		if (number.length() != 10) {
			throw new InvalidMobileNumberException();
		}
	}
}

public class MainClass3 {
	public static void main(String[] args) {
		// it Can Cause Exception so Handle it
		try {// 3
//			MobileNumberVerifier.verifyMobileNumber("9079213789");
			// --> it will not Cause Exception
			MobileNumberVerifier.verifyMobileNumber("34657847578");// --> it will Cause Exception
		} catch (InvalidMobileNumberException e) {
			// e.getMessage();
			e.printStackTrace();
		}
		System.out.println("Raja raj");// it will not get affected
	}
}
//com.jspider.customexception.InvalidMobileNumberException
//Raja raj
//	at com.jspider.customexception.MobileNumberVerifier.verifyMobileNumber(MainClass3.java:10)
//	at com.jspider.customexception.MainClass3.main(MainClass3.java:21)
