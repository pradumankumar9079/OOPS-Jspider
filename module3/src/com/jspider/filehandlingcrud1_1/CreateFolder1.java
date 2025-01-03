package com.jspider.filehandlingcrud1_1;

import java.io.File;

public class CreateFolder1 {
	public static void main(String[] args) {
		// Entering File Location as well as Name
		// Than Creating File Object
		File obj = new File("/home/kali/Desktop/FILEIO");

		// For Checking Purpose it Already Exist Or Not
		boolean flag = obj.exists();
//		System.out.println(flag);

		// Checking Folder Exist
		if (flag == false) {
			obj.mkdir();// Creating Folder
			System.out.println("Folder Created");
		} else {
			System.out.println("Folder Already Exits");
		}

	}
}
