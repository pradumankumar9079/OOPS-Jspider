package com.jspider.serializationde;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

// Deserialization Example
// this Phenomena happened in case of Library we use
// Written Object By Some Programmer Used By Some Other Programmer
public class MainClass2 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("/home/kali/Desktop/FILEIO/Repository.txt");
			ois = new ObjectInputStream(fis);
			Employee emp = (Employee) ois.readObject();// Automatically get upcasted so we have to downcast
			System.out.println(emp.eid);
			System.out.println(emp.ctc);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
//101
//4.5
