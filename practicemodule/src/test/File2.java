package test;

import java.io.File;

public class File2 {
	public static void main(String[] args) {
		File f = new File("/home/kali/Desktop/Lalu");
		boolean flag = f.exists();// Exist

		// List --> List All File or Folder Containing in that Directory
//		String arr[] = f.list();
//		System.out.println(Arrays.toString(arr));

		if (flag) {
//			f.mkdir();// false//No Exception

//			f.createNewFile();// false //IOException
//			System.out.println("Created");

//			f.delete();// true//No Exception
//			System.out.println("Deleted");

//			System.out.println(f.length());// true //No Exception

//			System.out.println(f.getAbsolutePath());//true//No Exception

//			System.out.println(f.isFile());// While true //No Exception
//			System.out.println(f.isDirectory()); // While true//No Exception

		} else {
//			System.out.println("Folder Already Exist");

//			System.out.println("File Already Exist");

//			System.out.println("File Does not Exist");
		}

	}
}
