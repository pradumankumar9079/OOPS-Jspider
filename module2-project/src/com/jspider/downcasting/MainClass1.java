package com.jspider.downcasting;

class Demo {

}

class Sample extends Demo {

}

public class MainClass1 {
	public static void main(String[] args) {
		/********** DownCasting *******************/
		// Object of Super class can't
		// assign in Object of subclass but we can do it forcefully

		// Demo ref = new Demo();
		// Sample s = ref;// Not Allowed DownCasting Now We will Force means do it
		// manually
		/*****************************/

		/******* Forcefull Conversion (Downcasting) ************/
		Demo ref = new Demo();
		Sample s = (Sample) ref;// Forcefully
		/*****************************/
	}
}
