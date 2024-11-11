package com.jspider.customexception;

//Checked Custom Exception because Extending With Exception 
// Real Life Testing Example

class InvalidIncidentLevelException extends Exception {// 1

}

class IncidentManager {// 2
	static void assignIncidentLevel(int level) throws InvalidIncidentLevelException {
		// it's Predefined in Company till 3 not having Level 4
		if (level > 3) {
			throw new InvalidIncidentLevelException();
		}
	}
}

public class TestingExample5 {
	public static void main(String[] args) {
		try {// 3
			IncidentManager.assignIncidentLevel(1);// not cause
			IncidentManager.assignIncidentLevel(2);// not cause
			IncidentManager.assignIncidentLevel(3);// not cause
			IncidentManager.assignIncidentLevel(4);// Cause Exception
		} catch (InvalidIncidentLevelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Raja raj");
	}
}

//com.jspider.customexception.InvalidIncidentLevelException
//Raja raj
//	at com.jspider.customexception.IncidentManager.assignIncidentLevel(TestingExample5.java:14)
//	at com.jspider.customexception.TestingExample5.main(TestingExample5.java:25)
