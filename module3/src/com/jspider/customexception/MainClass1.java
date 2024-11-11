package com.jspider.customexception;

//Checked Custom Exception because Extending With Exception 

class CustomException extends Exception {// 1

}

class Trigger {// 2
	static void verify(int num) throws CustomException {
		if (num % 5 == 0) {
			throw new CustomException();
		}
	}
}

public class MainClass1 {
	public static void main(String[] args) {
		try {// 3
			Trigger.verify(24);// --> Will Not Cause Exception
//			Trigger.verify(30);// --> will Cause Exception
		} catch (CustomException e) {
			e.printStackTrace();
		}
		System.out.println("Raja raj");// it will not get affected
	}
}
//com.jspider.customexception.CustomException
//at com.jspider.customexception.Trigger.verify(MainClass1.java:10)
//at com.jspider.customexception.MainClass1.main(MainClass1.java:19)
