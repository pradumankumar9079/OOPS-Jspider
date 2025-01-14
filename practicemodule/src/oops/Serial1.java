package oops;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// IOException--> (FOS,OOS),(FIS,OIS)
// ClassNotFoundException-->(FIS,OIS)
class Employee implements Serializable {
	String pid;
	int id;
	String name;

	Employee(int id, String name, String pid) {
		this.id = id;
		this.name = name;
		this.pid = pid;
	}

	@Override
	public String toString() {
		return id + " " + name + " " + pid;
	}
}

public class Serial1 {
	public static void main(String[] args) {
		Employee e1 = new Employee(101, "Raj", "JSP001");
		System.out.println(e1);
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("/home/kali/Desktop/Raj/raja.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(e1);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("/home/kali/Desktop/Raj/raja.txt");
			ois = new ObjectInputStream(fis);
			Employee e2 = (Employee) ois.readObject();
			System.out.println(e2.id);
			System.out.println(e2.name);
			System.out.println(e2.pid);

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				ois.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
