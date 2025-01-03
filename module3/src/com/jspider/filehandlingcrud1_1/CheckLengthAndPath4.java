package com.jspider.filehandlingcrud1_1;

import java.io.File;

public class CheckLengthAndPath4 {
	public static void main(String[] args) {
		File ref = new File("/home/kali/Desktop/FILEIO/Demo.txt");
		boolean flag = ref.exists();

		// true false always Decide
		if (flag == true) {
			System.out.println(ref.length());
			System.out.println(ref.getAbsolutePath());
		} else {
			System.out.println("File Does Not Exist");
		}
	}
}
