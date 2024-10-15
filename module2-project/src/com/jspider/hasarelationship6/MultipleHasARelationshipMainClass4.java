package com.jspider.hasarelationship6;

// How to read this
// College has a department and department has a teacher and teacher is teaching
// Look at Diagram in copy
class Teacher {
	void teach() {
		System.out.println("Teacher is Teaching");
	}
}

class Department {
	Teacher tr = new Teacher();
}

class College {
	Department dr = new Department();
}

public class MultipleHasARelationshipMainClass4 {
	public static void main(String[] args) {
		College col = new College();
		col.dr.tr.teach();
	}
}
