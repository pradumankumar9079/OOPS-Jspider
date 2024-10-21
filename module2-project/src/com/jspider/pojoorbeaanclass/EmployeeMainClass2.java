package com.jspider.pojoorbeaanclass;

// To generate right click source
class Employee {
	private int eId;
	private double ctc;

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public double getCtc() {
		return ctc;
	}

	public void setCtc(double ctc) {
		this.ctc = ctc;
	}

}

public class EmployeeMainClass2 {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.seteId(101);
		e1.setCtc(145);
		System.out.println("EID: " + e1.geteId());
		System.out.println("CTC: " + e1.getCtc());
	}
}
