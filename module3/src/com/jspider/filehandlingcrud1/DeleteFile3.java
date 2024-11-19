package com.jspider.filehandlingcrud1;

import java.io.File;

public class DeleteFile3 {
	public static void main(String[] args) {
		File ref = new File("/home/kali/Desktop/FILEIO/Demo.txt");
		boolean flag = ref.exists();

		if (flag == true) {
			ref.delete();
			System.out.println("Deleted");
		} else {
			System.out.println("Not Found");
		}
	}
}
