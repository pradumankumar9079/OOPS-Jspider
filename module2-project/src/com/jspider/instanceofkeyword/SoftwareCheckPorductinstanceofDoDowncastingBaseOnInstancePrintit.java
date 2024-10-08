package com.jspider.instanceofkeyword;

class SoftwareEngineer {
	void meeting() {

	}
}

class SoftwareDeveloper extends SoftwareEngineer {
	void coding() {

	}}

wclass TestEngineer extends SoftwareEngineer{

	void testing() {

	}
}

class Manager {
	static void assignTask(SoftwareEngineer s) {
		if (s instanceof SoftwareDeveloper) {
			SoftwareDeveloper dev = (SoftwareDeveloper) s;// Downcasting now
			// access testing means properties of SoftwareDeveloper
			dev.coding();
		} else if (s instanceof TestEngineer) {
			TestEngineer test = (TestEngineer) s;// Downcasting now
			// access testing means properties of SoftwareDeveloper
			test.testing();
		}
	}
}

public class SoftwareCheckPorductinstanceofDoDowncastingBaseOnInstancePrintit {

}