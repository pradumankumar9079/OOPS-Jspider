package practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// Serialization Example
class Employee implements Serializable {
	int id;
	transient double sal;

	Employee(int id, double sal) {
		this.id = id;
		this.sal = sal;
	}
}

public class SerializationExample {
	public static void main(String[] args) {
		Employee emp = new Employee(101, 20.000);

		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream("/home/kali/Desktop/FILEIO/Pavan/test.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(emp);
			System.out.println("Written Successfully: ");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (oos != null) {
					oos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				try {
					if (oos != null) {
						oos.close();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
				try {
					if (fos != null) {
						fos.close();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (fos != null) {
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try {
			fis = new FileInputStream("/home/kali/Desktop/FILEIO/Pavan/test.txt");
			ois = new ObjectInputStream(fis);
			Employee ee = (Employee) ois.readObject();
			System.out.print(ee.id + "--> " + ee.sal);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (ois != null) {
					ois.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if (fis != null) {
					fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
