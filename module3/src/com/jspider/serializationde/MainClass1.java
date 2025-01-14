package com.jspider.serializationde;

// Serialization Example
// it's is Use to Share Object with Different Programs(Not Passing)3
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable {
	int eid;
	double ctc;
}

public class MainClass1 {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.eid = 101;
		emp.ctc = 4.5;
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("/home/kali/Desktop/FILEIO/Repository.txt");// This Is Like Object Pack for
																					// Particular Location
			oos = new ObjectOutputStream(fos);// This Is Like Booking Vehicle to Transfer Our Object
			oos.writeObject(emp);
			System.out.println("Serialization Completed");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
//Serialization Completed