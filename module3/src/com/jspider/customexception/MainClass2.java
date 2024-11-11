package com.jspider.customexception;

//Checked Custom Exception because Extending With Exception 
class OverSpeedException extends Exception {// 1

}

class HighWayPatrol {// 2
	static void checkSpeed(int speed) throws OverSpeedException {
		if (speed > 80) {
			throw new OverSpeedException();
		}
	}
}

public class MainClass2 {
	public static void main(String[] args) {
		try {// 3
			/**********************************************/
			// Here Some of the input can cause Exception so mandatory to handle else
			// programme will terminate unexpetedly
			/*********************************************/

			HighWayPatrol.checkSpeed(68);// This Speed will not cause Exception-->No Output
			HighWayPatrol.checkSpeed(75);// This Speed will also not Cause Exception--> No Output

			HighWayPatrol.checkSpeed(120);// This Speed will Cause Exception
		} catch (OverSpeedException e) {
			e.printStackTrace();
		}
		System.out.println("Raja raj");// it will not get affected
	}
}
//com.jspider.customexception.OverSpeedException
//at com.jspider.customexception.HighWayPatrol.checkSpeed(MainClass2.java:10)
//at com.jspider.customexception.MainClass2.main(MainClass2.java:23)
//Raja raj
