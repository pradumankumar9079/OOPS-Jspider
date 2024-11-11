package com.jspider.customexception;

//Checked Custom Exception because Extending With Exception 
// InvalidPinCode Example in india we are having six digit

class InvalidPinNumberException extends Exception {// 1
	// unnecessary but if we want getMessage to Work we need to Override
	// @Override
//	public String getMessage() {
//		return "InvalidPinNumberException";
//	}
}

class pinNumberVerifier {// 2
	static void verifyPinNumber(String number) throws InvalidPinNumberException {
		if (number.length() != 6) {
			throw new InvalidPinNumberException();
		}
	}
}

public class InvalidPinCodeExample6 {
	public static void main(String[] args) {
		// it Can Cause Exception so Handle it
		try {// 3
			pinNumberVerifier.verifyPinNumber("854204");
			// --> it will not Cause Exception
//			pinNumberVerifier.verifyPinNumber("34657847578");// --> it will Cause Exception
		} catch (InvalidPinNumberException e) {
			// TODO Auto-generated catch block
			// e.getMessage();
			e.printStackTrace();
		}
		System.out.println("Raja raj");// it will not get affected
	}
}

//com.jspider.customexception.InvalidPinNumberException
//at com.jspider.customexception.pinNumberVerifier.verifyPinNumber(InvalidPinCodeExample6.java:17)
//at com.jspider.customexception.InvalidPinCodeExample6.main(InvalidPinCodeExample6.java:28)
//Raja raj
