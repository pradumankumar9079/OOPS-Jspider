package com.jspider.instanceofkeyword;

class SoftwareEngineer {
	void meeting() {
		System.out.println("Executing meeting()...");
	}
}

class SoftwareDeveloper extends SoftwareEngineer {
	void coding() {
		System.out.println("Executing coding()...");
	}
}

class TestEngineer extends SoftwareEngineer {

	void testing() {
		System.out.println("Executing testing()...");
	}
}

class Manager {
	static void assignTask(SoftwareEngineer s) {
		if (s instanceof SoftwareDeveloper) {
			// Downcasting now
			SoftwareDeveloper dev = (SoftwareDeveloper) s;
			// access testing means properties of SoftwareDeveloper
			dev.coding();
			dev.meeting();
		} else if (s instanceof TestEngineer) {
			TestEngineer test = (TestEngineer) s;// Downcasting now
			// access testing means properties of SoftwareDeveloper
			test.testing();
		}
	}
}

public class SoftwareCheckPorductinstanceofDoDowncastingBaseOnInstancePrintit {
	public static void main(String[] args) {
		Manager.assignTask(new SoftwareDeveloper());
		Manager.assignTask(new TestEngineer());
	}
}